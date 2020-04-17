# Selenium-ScalaTest
A Simple template repository to showcase usage of Selenium tests using ScalaTest framework with Page Object Pattern 
way of organizing tests.

ScalaTest is the most flexible testing tool in the Scala ecosystem. With ScalaTest, you can test Scala, 
Scala.js (JavaScript), and Java code. ScalaTest includes a DSL for writing browser-based tests using Selenium.

To understand about the folder structure of this Scala project, please refer this [blog](http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/intellij-project-structure-getting-started-scala-project/) post

### Build tool
We use `sbt` as a build tool. It is an open-source build tool for Scala and Java projects, similar to 
Apache's Maven and Ant.

Please follow the [instructions](https://www.scala-sbt.org/1.x/docs/Setup.html) to install `sbt` on your machine 
and available in PATH

Just like in any other project, the first step is to add selenium dependency to the build file(sbt) using
```scala
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "3.141.59" % "test"
```

### Source
To demonstrate the implementation of page object pattern we use two application here, Google Search and 
Spree Demo website. Note that we don't use Page Factory pattern here as its going to be deprecated.

The tests are located [here](/src/test/scala/tests) and the pageobject classes are located [here](src/test/scala/pages)

### Execute Tests
`sbt test`
### IDE
You could use [Scala for Eclipse](http://scala-ide.org/) or IntelliJ Idea Community with Scala [plugin](https://plugins.jetbrains.com/plugin/1347-scala)

References:
* [Scala School](https://twitter.github.io/scala_school/)
* [sbt-reference](https://www.scala-sbt.org/1.x/docs/index.html)
* [Scala Test](http://www.scalatest.org/)
