name := "play-223-test-templates"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

sourceGenerators in Test <+= (state, unmanagedSourceDirectories in Test, sourceManaged in Test, templatesTypes, templatesImport) map ScalaTemplates
