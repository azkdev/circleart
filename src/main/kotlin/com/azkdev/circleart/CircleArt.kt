package com.azkdev.circleart

import com.azkdev.circleart.view.MainView
import javafx.application.Application
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

}

fun main(args: Array<String>) {
    Application.launch(CircleArt::class.java, *args)
}