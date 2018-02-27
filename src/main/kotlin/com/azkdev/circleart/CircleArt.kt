package com.azkdev.circleart

import javafx.application.Application
import tornadofx.App

class CircleArt : App()

fun main(args: Array<String>) {
    Application.launch(CircleArt::class.java, *args)
}