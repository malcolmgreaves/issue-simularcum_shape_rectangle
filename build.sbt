// GAV

lazy val pName = "typeclass_issue_shape"
organization := "io.malcolmgreaves"
name := pName
version := "0.0.0-SNAPSHOT"

// scala & java

scalaVersion := "2.11.7"
scalacOptions ++= Seq(
 "-language:experimental.macros",
 "-Ymacro-debug-lite"
)
 
javacOptions += "-Xlint:unchecked"

// libraries 

resolvers ++= Seq(
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/",
  "Sonatype Shapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
)
libraryDependencies ++= Seq(
  // algebra
  "com.github.mpilquist" %% "simulacrum" % "0.4.0",
  // testing
  "org.scalatest"        %% "scalatest"  %  "2.2.4" % Test
)
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0-M5" cross CrossVersion.full)   

// test options

fork in Test := false

parallelExecution in Test := false
