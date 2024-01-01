ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "$scala_version$"

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(name := "$name$")

libraryDependencies ++= Seq(
  $if (http4s.truthy)$
    ,
    "org.http4s" %% "http4s-ember-client" % http4sVersion,
    "org.http4s" %% "http4s-ember-server" % http4sVersion,
    "org.http4s" %% "http4s-dsl"          % http4sVersion,
  $endif$

  "com.disneystreaming" %% "weaver-cats" % "$weaver_version$" % Test,
  "com.disneystreaming" %% "weaver-scalacheck" % "$weaver_version$" % Test
 )

testFrameworks += new TestFramework("weaver.framework.CatsEffect")
