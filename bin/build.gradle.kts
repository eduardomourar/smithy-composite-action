plugins {
  id("software.amazon.smithy").version("0.6.0")
}

repositories {
  mavenCentral()
}

val smithyVersion = "1.19.0"
val smithyTypescriptVersion = "0.10.0"

dependencies {
  implementation("software.amazon.smithy:smithy-cli:$smithyVersion")
  implementation("software.amazon.smithy:smithy-aws-traits:$smithyVersion")
  implementation("software.amazon.smithy:smithy-openapi:$smithyVersion")
  implementation("software.amazon.smithy.typescript:smithy-typescript-codegen:$smithyTypescriptVersion")
  implementation("software.amazon.smithy.typescript:smithy-aws-typescript-codegen:$smithyTypescriptVersion")
}

// This project doesn't produce a JAR.
tasks["jar"].enabled = false
