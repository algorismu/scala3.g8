ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "$scala_version$"

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(name := "$name$")

libraryDependencies ++= Seq(
  "org.scalameta" %% "munit" % "0.7.29" % Test,
  "org.scalacheck" %% "scalacheck" % "1.17.0" % Test
 )
