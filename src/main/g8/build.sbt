ThisBuild / version := "0.0.1-SNAPSHOT"

ThisBuild / scalaVersion := "$scala_version$"

lazy val `$name;format="norm"$` =
    project
        .in(file("."))
        .settings(
            name := "$name$"
        )
