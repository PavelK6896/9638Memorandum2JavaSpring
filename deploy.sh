#!/usr/bin/env bash

echo 'Copy files...'

scp -i "C:\pav-key-frankfurt.pem" target/9638Memorandum2JavaSpring-1.0-SNAPSHOT.jar ubuntu@3.121.40.255:/home/ubuntu/

echo 'Restart server...'

ssh -i "C:\pav-key-frankfurt.pem" ubuntu@3.121.40.255 << EOF
pgrep java | xargs kill -9
nohup java -jar 9638Memorandum2JavaSpring-1.0-SNAPSHOT.jar > log2.txt &
EOF

echo 'Bye'