package com.azkdev.circleart

import com.azkdev.circleart.view.MainView
import javafx.application.Application
import tornadofx.App

class CircleArt : App(MainView::class)

fun main(args: Array<String>) {
    Application.launch(CircleArt::class.java, *args)
}