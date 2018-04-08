version := "0.1"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.10.7", "2.11.12", "2.12.4")

libraryDependencies += "org.specs2" %% "specs2" % "2.5" % "test"

coverageMinimum := 80

coverageFailOnMinimum := true

import org.scoverage.coveralls.Imports.CoverallsKeys._
coverallsToken := Some("VzWFlViUxsWc2wc5ikJ5Mo9GNJ7wMDjPU")
coverallsGitRepoLocation := Some("..")
