name := "shared-build-sources"

version := "0.1"

scalaVersion := "2.12.3"

val buildShared = ProjectRef(file("project"), "buildShared")
val root = (project in file("."))
  .dependsOn(buildShared)

val n = shared.BuildShared.sharedInt