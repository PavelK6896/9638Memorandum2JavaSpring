package app.web.pavelk.memorandum2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/info").setViewName("/proxy1/info1.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/proxy1/*")
                .addResourceLocations("classpath:/info1/");//BOOT-INF ява папка все ресурсы спринга

        registry.addResourceHandler("/file/**")
                .addResourceLocations("classpath:/info1/file.txt");

        registry.addResourceHandler("/f/**")
                .addResourceLocations("file:setting"); //один файл файловая система
    }

}
