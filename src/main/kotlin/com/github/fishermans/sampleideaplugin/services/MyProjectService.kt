package com.github.fishermans.sampleideaplugin.services

import com.intellij.openapi.project.Project
import com.github.fishermans.sampleideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
