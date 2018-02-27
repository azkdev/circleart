package com.azkdev.circleart

import com.azkdev.circleart.view.MainView
import javafx.application.Application
import javafx.scene.paint.Color
import javafx.stage.Stage
import javafx.stage.StageStyle
import tornadofx.*

class CircleArt : App(MainView::class) {

    override fun start(stage: Stage) {
        stage.isResizable = false
        stage.centerOnScreen()
        stage.initStyle(StageStyle.TRANSPARENT)
        super.start(stage)
    }

    override fun createPrimaryScene(view: UIComponent) = super.createPrimaryScene(view).apply {
        fill = Color.TRANSPARENT
    }

}

fun main(args: Array<String>) {
    Application.launch(CircleArt::class.java, *args)
}