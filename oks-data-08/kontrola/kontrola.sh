#!/bin/bash
clear

ls -R *.java > sources.txt
javac -d . -cp apiguardian-api-1.0.0.jar:htmlunit-driver-3.56.0-jar-with-dependencies.jar:junit-jupiter-api-5.4.1.jar:junit-jupiter-engine-5.4.1.jar:junit-jupiter-params-5.4.1.jar:junit-platform-commons-1.4.1.jar:junit-platform-engine-1.4.1.jar:junit-platform-launcher-1.4.1.jar:junit-platform-runner-1.4.1.jar:opentest4j-1.1.1.jar:selenium-4.1.2.jar:. -encoding UTF-8 @sources.txt
java -cp apiguardian-api-1.0.0.jar:htmlunit-driver-3.56.0-jar-with-dependencies.jar:junit-jupiter-api-5.4.1.jar:junit-jupiter-engine-5.4.1.jar:junit-jupiter-params-5.4.1.jar:junit-platform-commons-1.4.1.jar:junit-platform-engine-1.4.1.jar:junit-platform-launcher-1.4.1.jar:junit-platform-runner-1.4.1.jar:opentest4j-1.1.1.jar:selenium-4.1.2.jar:. oks08.Kontrola_Prj_08
