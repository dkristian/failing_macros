organization := "default-9eed97"

name := "default"

version := "0.1-SNAPSHOT"

// Works
//scalaVersion := "2.10.0-M3"

// Doesn't work
scalaVersion := "2.10.0-M5"

scalacOptions ++= Seq("-language:experimental.macros")
