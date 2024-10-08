import Dependencies._

ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "pgconnect",
    libraryDependencies += munit % Test
  )

libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "42.2.5",
  "org.scalatest" %% "scalatest" % "3.2.14" % Test,
  "org.mockito" %% "mockito-scala" % "1.17.12" % Test
)


// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
