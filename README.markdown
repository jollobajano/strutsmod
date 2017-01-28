Modular Struts2
===============


This is a proof of concept.

I wanted to find out how to divide up a large Struts2 project into
sub modules, preferably into Maven modules packaging the actions and
results into JAR files, in order to create a _feature per archive_
type layout.

I thought I've seen some texts about it years ago but they were
nowhere to be seen.

After spending a full day, unsuccessfully, trying to get Struts2 to
find results in the JAR files I resigned and found a solution using
WAR archives and Maven overlays.

When you build a WAR package with Maven and have dependencies of type
`war` they are not added to `WEB-INF/lib` but rather unpacked and the
contents are added to the final WAR. So I put the different parts of
the application into separate modules that are collected into the
final WAR as it is built.

In this scenario we have one main application (`application`) and a
module (`module1`).


__Addendum__

I finally found a workaround using Servlet API &gt;=3.0.

You can publish web resources from a JAR by placing them under the
`META-INF/resources` directory in the JAR file.

I added a second module called `module2` this is a Maven project which
produces a JAR file containing an action and a result. When the
application is deployed the second module can be found at
[http://localhost:8080/second/another.action](http://localhost:8080/second/another.action)




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
