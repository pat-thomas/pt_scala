name := "pt_scala"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.enragedginger" %% "akka-quartz-scheduler" % "1.5.0-akka-2.4.x"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.1"
libraryDependencies += "com.typesafe.play" %% "play-ws" % "2.4.3"

mainClass in (Compile, run) := Some("pt.Main")
    