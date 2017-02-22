name := """akkademy-db-scala"""

version := "1.0"

scalaVersion := "2.11.8"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.17",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.17",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//  exclude("org.scala-lang", "scala-reflect")
  exclude("org.scala-lang.modules", "scala-xml_2.11")
)