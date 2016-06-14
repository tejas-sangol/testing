#!/bin/bash
root_dir=`pwd`
javac -cp .:"$root_dir"/hamcrest-core-1.3.jar:"$root_dir"/junit-4.12.jar *.java
java -cp .:/"$root_dir"/junit-4.12.jar:/"$root_dir"/hamcrest-core-1.3.jar TestRunner > s
echo `tail -1 s` > s
echo "$PWD" > dir
echo `cut  -d'/' -f10 dir` > id
#cat id
echo `cat id s | paste -d, - -` > result
#rm s id
