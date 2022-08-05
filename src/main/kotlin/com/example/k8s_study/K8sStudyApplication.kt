package com.example.k8s_study

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K8sStudyApplication

fun main(args: Array<String>) {
    runApplication<K8sStudyApplication>(*args)
}
