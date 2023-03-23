import sbt.Keys.crossScalaVersions

lazy val scala212               = "2.12.17"
lazy val scala213               = "2.13.10"
lazy val supportedScalaVersions = List(scala212, scala213)

ThisBuild / scalaVersion := scala213
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-bug-reproduction",
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-collection-compat" % "2.8.1", // Scala 2.12 <> 2.13 compat
      "com.pauldijou"          %% "jwt-play-json"           % "5.0.0" // JWT parsing
    ),
    scalafmtOnCompile := true,
    scalaVersion := scala213,
    crossScalaVersions := supportedScalaVersions
  )
