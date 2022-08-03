package com.example.k8s_study

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class K8sStudyApplication

fun main(args: Array<String>) {
    runApplication<K8sStudyApplication>(*args)
}
