package com.azkdev.circleart.view

import javafx.geometry.Insets
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.CornerRadii
import tornadofx.*

class MainView : View() {

    override val root = hbox {
        prefWidth = 560.0
        prefHeight = 500.0
        spacing = 10.0

        stackpane {
            prefWidth = 500.0
            prefHeight = 500.0
            background = Background(BackgroundFill(c(51, 51, 51, 1.0), CornerRadii.EMPTY, Insets.EMPTY))
        }

        vbox {
            prefWidth = 50.0
            prefHeight = 500.0
            background = Background(BackgroundFill(c(51, 51, 51, 1.0), CornerRadii.EMPTY, Insets.EMPTY))
        }
    }

}