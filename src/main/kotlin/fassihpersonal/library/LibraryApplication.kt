package fassihpersonal.library

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LibraryApplication

fun main(args: Array<String>) {
	runApplication<LibraryApplication>(*args)
	println("Starting server on http://localhost:8080")
}
