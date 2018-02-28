package com.azkdev.circleart.view

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView
import javafx.application.Platform
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.layout.*
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*

class MainView : View() {

    private var offX: Double = 0.0
    private var offY: Double = 0.0

    override val root = hbox {
        setPrefSize(560.0, 500.0)
        spacing = 10.0
        style {
            backgroundColor += Color.TRANSPARENT
        }

        stackpane {
            prefWidth = 500.0
            prefHeight = 500.0
            background = Background(BackgroundFill(c(255, 255, 255, 1.0), CornerRadii.EMPTY, Insets.EMPTY))
        }

        vbox {
            prefWidth = 50.0
            prefHeight = 500.0
            setOnMousePressed {
                offX = primaryStage.x - it.screenX
                offY = primaryStage.y - it.screenY
            }
            setOnMouseDragged {
                primaryStage.x = it.screenX + offX
                primaryStage.y = it.screenY + offY
            }
            background = Background(BackgroundFill(c(255, 255, 255, 1.0), CornerRadii.EMPTY, Insets.EMPTY))

            stackpane {
                setPrefSize(50.0, 50.0)

                label("", FontAwesomeIconView(FontAwesomeIcon.POWER_OFF).apply {
                    size = "40px"
                    style {
                        fill = c(55, 55, 55, 1.0)
                    }
                }) {
                    setPrefSize(20.0, 20.0)
                    alignment = Pos.CENTER
                    setOnMouseClicked {
                        Platform.exit()
                    }
                }
            }
        }
    }

}