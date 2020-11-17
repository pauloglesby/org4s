import sbt._

object Dependencies {
  lazy val catsVersion = "2.2.0"

  lazy val catsCore: Seq[ModuleID] = Seq("org.typelevel" %% "cats-core" % catsVersion)

  lazy val baseDependencies: Seq[ModuleID] =
    catsCore

  lazy val munit = "org.scalameta" %% "munit" % "0.7.7" % Test

  /* ------- MODULES --------- */

  lazy val coreDependencies = baseDependencies ++ Seq(munit)
}
