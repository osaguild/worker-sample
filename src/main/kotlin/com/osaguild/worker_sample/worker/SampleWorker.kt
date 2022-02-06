package com.osaguild.worker_sample.worker

import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class SampleWorker {

    @Scheduled(fixedRate = 86400000)
    fun execute() {
        log.info("SampleWorker test")
    }
    companion object {
        private val log = LoggerFactory.getLogger(SampleWorker::class.java)
    }
}