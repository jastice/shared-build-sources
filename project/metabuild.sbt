val buildShared = project
val buildRoot = (project in file("."))
  .dependsOn(buildShared)
