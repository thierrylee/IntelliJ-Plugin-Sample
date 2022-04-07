package com.octo.testplugin

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.openapi.editor.Document
import com.intellij.openapi.fileEditor.FileDocumentManager
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

@Suppress("MemberVisibilityCanBePrivate", "unused")
object Utils {

    private const val KOTLIN_LANGUAGE_ID = "kotlin"

    fun getCurrentFile(actionEvent: AnActionEvent?): VirtualFile? = actionEvent?.getData(LangDataKeys.VIRTUAL_FILE)

    fun getCurrentDocument(actionEvent: AnActionEvent?) = actionEvent?.getData(LangDataKeys.EDITOR)?.document

    fun isKotlinFile(actionEvent: AnActionEvent?) =
        actionEvent?.getData(LangDataKeys.LANGUAGE)?.id == KOTLIN_LANGUAGE_ID

    fun getCurrentFileText(actionEvent: AnActionEvent?): String? = actionEvent?.getData(LangDataKeys.FILE_TEXT)

    fun getProjectRootFile(actionEvent: AnActionEvent?): VirtualFile? = actionEvent?.project?.baseDir

    fun getProjectRootPath(actionEvent: AnActionEvent?): String? = actionEvent?.project?.basePath

}