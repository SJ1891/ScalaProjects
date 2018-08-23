name := "scalaprojects"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % Test

resolvers ++=
  Seq(Resolver.mavenLocal,
    "HortonWorks" at "http://repo.hortonworks.com/content/repositories/releases/",
    "HortonWorks-Jetty" at "http://repo.hortonworks.com/content/repositories/jetty-hadoop/",
    "mv-artifacts" at "https://mvnrepository.com/artifact",
    "maven" at "https://mvnrepository.com/repos/central")