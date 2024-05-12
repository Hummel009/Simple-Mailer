import java.time.LocalDate
import java.time.format.DateTimeFormatter

plugins {
	id("org.jetbrains.kotlin.jvm") version "1.9.24"
	id("application")
}

group = "com.github.hummel"
version = LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd"))

val embed: Configuration by configurations.creating

dependencies {
	embed("org.jetbrains.kotlin:kotlin-stdlib:1.9.24")
	embed("com.sun.mail:jakarta.mail:2.0.1")
	implementation("com.sun.mail:jakarta.mail:2.0.1")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(8)
	}
}

application {
	mainClass = "com.github.hummel.mailer.MainKt"
}

tasks {
	named<JavaExec>("run") {
		standardInput = System.`in`
	}
	jar {
		manifest {
			attributes(
				mapOf(
					"Main-Class" to "com.github.hummel.mailer.MainKt"
				)
			)
		}
		from(embed.map {
			if (it.isDirectory) it else zipTree(it)
		})
		duplicatesStrategy = DuplicatesStrategy.EXCLUDE
	}
}
