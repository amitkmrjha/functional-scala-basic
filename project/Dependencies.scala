import sbt.*

object Dependencies {
  val scalaTest  = "org.scalatest"  %% "scalatest"  % Version.scalaTest  % Test
  val scalaCheck = "org.scalacheck" %% "scalacheck" % Version.scalaCheck % Test

  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % Version.scalaLog

  val logback        = "ch.qos.logback"         % "logback-classic"      % Version.logback
  val logbackJson    = "ch.qos.logback.contrib" % "logback-json-classic" % Version.logbackContrib
  val logbackJackson = "ch.qos.logback.contrib" % "logback-jackson"      % Version.logbackContrib
}
