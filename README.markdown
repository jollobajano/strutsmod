Modular Struts2
===============


This is a proof of concept.

I wanted to find out how to divide up a large Struts2 project into
sub modules, preferably into Maven modules packaging the actions and
results into JAR files.

I thought I've seen some texts about it years ago but they were
nowhere to be seen.

After spending a full day, unsuccessfully, trying to get Struts2 to
find results in the JAR files I resigned and found a solution using
WAR archives and Maven overlays.




Building
--------


There are an aggregator project and two modules

 + `application` is the "main" application
 + `module1` is the module with an action and a result of it's own.
 

Build it with

```

mvn clean install

```

to build the web appliction in `application/target/strutsmod-application.war`


I deployed it on a WildFly 8.2.1.Final, built it with Java 1.7.

Browse it at
[http://localhost:8080/hello-world.action](http://localhost:8080/hello-world.action)
