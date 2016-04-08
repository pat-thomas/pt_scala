name := "pt_scala"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.enragedginger" %% "akka-quartz-scheduler" % "1.5.0-akka-2.4.x"

mainClass in (Compile, run) := Some("pt.Main")
    