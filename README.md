# sbt shared build sources

Project that shows how to set up an sbt project with sources available to both by the project build and regular project.
There are alternative approaches, such as using [sbt-buildinfo](https://github.com/sbt/sbt-buildinfo) or using 
the `unmanagedSourceDirectories` to share the sources, but these are limited or don't work well in IntelliJ.

## howto

Create a file project/metabuild.sbt:

    val buildShared = project
    val buildRoot = (project in file("."))
      .dependsOn(buildShared)
      
and in your build.sbt:

    val buildShared = ProjectRef(file("project"), "buildShared")
    val root = (project in file("."))
      .dependsOn(buildShared)
      
Then put your shared code in project/buildShared/src/main/scala/ and refresh. Your project will look something like this in IntelliJ:

 

Related StackOverflow answer:
https://stackoverflow.com/questions/22986957/how-to-share-code-between-project-and-build-definition-project-in-sbt/46075218#46075218