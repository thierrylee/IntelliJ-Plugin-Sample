package com.octo.testplugin.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import com.octo.testplugin.Utils

class TestAction : AnAction() {

    override fun update(e: AnActionEvent) {
        e.presentation.isEnabledAndVisible = true
    }

    override fun actionPerformed(e: AnActionEvent) {
        Utils.getCurrentFile(e)?.let { currentFile ->
            val message = "actionPerformed on file:\n${currentFile.path}\n"
            Messages.showMessageDialog(message, "Title,", Messages.getInformationIcon())
            println(message)
        }
    }
}