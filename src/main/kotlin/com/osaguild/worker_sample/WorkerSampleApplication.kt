package com.osaguild.worker_sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class WorkerSampleApplication

fun main(args: Array<String>) {
	runApplication<WorkerSampleApplication>(*args)
}
