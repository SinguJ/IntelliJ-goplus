package com.github.singuj.intellijgoplus.services

import com.intellij.openapi.project.Project
import com.github.singuj.intellijgoplus.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
