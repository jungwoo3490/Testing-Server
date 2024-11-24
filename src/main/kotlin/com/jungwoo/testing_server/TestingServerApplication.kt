package com.jungwoo.testing_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestingServerApplication

fun main(args: Array<String>) {
	runApplication<TestingServerApplication>(*args)
}
