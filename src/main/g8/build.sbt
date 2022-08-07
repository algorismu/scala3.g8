ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "$scala_version$"

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(
      name := "$name$"
    )
