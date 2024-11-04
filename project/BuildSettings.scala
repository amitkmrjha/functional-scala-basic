import Dependencies.*
import sbt.*
import sbt.Keys.*

object BuildSettings {
  val buildScalaVersion = "3.5.2"
  val buildVersion      = "0.0.1"

  val buildSettings = Defaults.coreDefaultSettings ++
    Seq(
      version                  := buildVersion,
      scalaVersion             := buildScalaVersion,
      scalacOptions ++= Seq(
        "-Xtarget:11",
        "-deprecation",
        "-unchecked",
        "-feature"
      ),
      javaOptions ++= Seq("--add-opens=java.base/java.util.concurrent=ALL-UNNAMED"),
      Test / parallelExecution := true,
      Test / fork              := true
    )
}
