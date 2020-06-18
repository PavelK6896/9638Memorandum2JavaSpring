package app.web.pavelk.memorandum2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {
    @GetMapping("/")
    public String greeting() {
        return "i1.html";
    }
}
