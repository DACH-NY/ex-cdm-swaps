import scala.util.Try

name := "CdmSwaps"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value
libraryDependencies += "com.daml" % "bindings-rxjava" % "1.1.1"
libraryDependencies += "com.daml" %% "daml-lf-archive-reader" % "1.1.1"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe" % "config" % "1.2.1"
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.5"

// resolvers ++= Seq(
//   Resolver.mavenLocal,
//   "da repository" at "https://digitalassetsdk.bintray.com/DigitalAssetSDK"
// )

// credentials += Credentials(
//   Try(file(System.getenv("SBT_CREDENTIALS"))).getOrElse(Path.userHome / ".sbt" / ".credentials.bintray"))
