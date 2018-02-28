package com.azkdev.circleart.view

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView
import javafx.application.Platform
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.layout.*
import javafx.scene.paint.Color
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
            background = Background(BackgroundFill(c(55, 55, 55, 1.0), CornerRadii.EMPTY, Insets.EMPTY))
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
            background = Background(BackgroundFill(c(55, 55, 55, 1.0), CornerRadii.EMPTY, Insets.EMPTY))

            hbox {
                setPrefSize(50.0, 20.0)
                spacing = 5.0
                alignment = Pos.CENTER

                label("", FontAwesomeIconView(FontAwesomeIcon.CARET_DOWN).apply {
                    size = "20px"
                    style {
                        fill = c(0, 200, 0, 1.0)
                    }
                }) {
                    setPrefSize(20.0, 20.0)
                    alignment = Pos.CENTER
                    setOnMouseClicked {
                        primaryStage.isMaximized = false
                    }
                }
                label("", FontAwesomeIconView(FontAwesomeIcon.TIMES).apply {
                    size = "20px"
                    style {
                        fill = c(200, 0, 0, 1.0)
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