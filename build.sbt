import BuildSettings.*
import Dependencies.*

val utilDeps = Seq(scalaTest, scalaCheck, scalaLogging, logback, logbackJson, logbackJackson)

lazy val `functional-scala-workshop` = (project in file("."))
  .aggregate(`functional-exercise`, `functional-solution`)

lazy val `functional-exercise` = (project in file("functional-exercise"))
  .settings(buildSettings *)
  .settings(libraryDependencies ++= utilDeps)

lazy val `functional-solution` = (project in file("functional-solution"))
  .settings(buildSettings *)
  .settings(libraryDependencies ++= Seq())
  .dependsOn(`functional-exercise`)
