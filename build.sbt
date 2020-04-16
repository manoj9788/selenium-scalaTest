name := "Selenium-ScalaTest"

version := "0.1"

scalaVersion := "2.13.1"

fork in Test := true

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "3.141.59",
  "org.scalatestplus" %% "scalatestplus-selenium" % "1.0.0-M2",
  "org.scalatest" %% "scalatest" % "3.1.1" % Test)
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/reports")
