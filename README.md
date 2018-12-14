# Template-Gradle-FatJar
Fast creating FatJar with Gradle  
Suitable for Learning  
Problem: hard to create working jar with all dependencies


## Restoring project from template, in IDEA
### Download zip 
0.Download Zip from Github (green button Clone and Download)  
1.Unzip  
2.IDEA File/Open chose unzipped folder  
3.Wait until Gradle do jobs  
4.Run Gradle Tasks/shadow/shadowJar  
5.Now you must have FatJar with all dependencies, and working template


### Checkout from Github
1.Copy link from Github, (green button Clone and Download)  
2.IDEA File/New Project from Version control/Git paste link  
3.Import Gradle  
4.Wait until Gradle do jobs  
5.Run Gradle Tasks/shadow/shadowJar  
6.Now you must have FatJar with all dependencies, and working template


## Using FatJar
in Bash: java -jar nameOfFatJar.jar 1stparam 2param andsoon  
example: in Bash  
$ java -jar templategradlecli.jar D:/111.csv  
this command run FatJar and pass param in program


## Creating new project above template
1.Create your dependencies in build.gradle. This template contain dependencies to opencsv and math3 library for learning purpose.  
2.Create Java classes for your task. Example FatJar showing HelloWorld text  
3.Run Gradle Tasks/shadow/shadowJar for creating FatJar


## OTHER:
Another approach is Gradle Application plugin, which create .zip and/or .tar.  
More Advanced solution for specific problems
