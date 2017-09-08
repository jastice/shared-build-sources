import sbt.{Resolver, _}

object Common {

  object Resolvers {
    val mavenPatched  = "jb-maven-patched" at "http://dl.bintray.com/jetbrains/maven-patched/"
    val sonatypeReleases = Resolver.sonatypeRepo("releases")
    val metaBintray = Resolver.url("scalameta-bintray", url("https://dl.bintray.com/scalameta/maven"))(Resolver.ivyStylePatterns)
  }
}
