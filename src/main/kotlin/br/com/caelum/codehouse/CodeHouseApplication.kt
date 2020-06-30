package br.com.caelum.codehouse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CodeHouseApplication

fun main(args: Array<String>) {
	runApplication<CodeHouseApplication>(*args)
}
