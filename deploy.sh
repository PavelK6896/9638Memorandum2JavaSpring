#!/usr/bin/env bash

scp -i "C:\pav-key-frankfurt.pem" target/9638Memorandum2JavaSpring-1.0-SNAPSHOT.jar ubuntu@35.158.132.114:/home/ubuntu/

ssh -i "C:\pav-key-frankfurt.pem" ubuntu@35.158.132.114 << EOF
pgrep -f 9638Memorandum2JavaSpring-1.0-SNAPSHOT.jar | xargs kill -9
nohup java -jar 9638Memorandum2JavaSpring-1.0-SNAPSHOT.jar > log/test1.txt &
EOF


