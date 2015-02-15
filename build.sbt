name := "plush-web"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

val akkaVersion = "2.3.5"

scalaVersion := "2.11.1"

libraryDependencies := Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "net.debasishg" % "redisclient_2.11" % "2.14",
  "com.notnoop.apns" % "apns" % "0.2.3"
)

scalacOptions ++= Seq("-feature", "-language:_")

