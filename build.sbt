name := """bonobo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "com.amazonaws" % "aws-java-sdk-dynamodb" % "1.10.20",
  "com.adrianhurt" %% "play-bootstrap3" % "0.4.4-P24"
)

libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "1.1.5"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

scalariformSettings
