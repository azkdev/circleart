package com.azkdev.circleart.view

import javafx.application.Platform
import javafx.beans.binding.Bindings.and
import javafx.geometry.Insets
import javafx.scene.image.Image
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
            background = Background(BackgroundFill(c(255, 255, 255, 1.0), CornerRadii.EMPTY, Insets.EMPTY))
        }

        vbox {
            prefWidth = 50.0
            prefHeight = 500.0
            spacing = 20.0
            background = Background(BackgroundFill(c(255, 255, 255, 1.0), CornerRadii.EMPTY, Insets.EMPTY))

            setOnMousePressed {
                offX = primaryStage.x - it.screenX
                offY = primaryStage.y - it.screenY
            }

            setOnMouseDragged {
                primaryStage.x = it.screenX + offX
                primaryStage.y = it.screenY + offY
            }

            stackpane {
                setPrefSize(50.0, 50.0)
                

                imageview {
                    image = Image(resources["/icons/power.png"])
                }

                setOnMouseClicked {
                    Platform.exit()
                }
            }

            stackpane {
                setPrefSize(50.0, 50.0)

                imageview {
                    image = Image(resources["/icons/new.png"])
                }
            }

            stackpane {
                setPrefSize(50.0, 50.0)

                imageview {
                    image = Image(resources["/icons/play.png"])
                }
            }

            stackpane {
                setPrefSize(50.0, 50.0)

                imageview {
                    image = Image(resources["/icons/pause.png"])
                }
            }

            stackpane {
                setPrefSize(50.0, 50.0)

                imageview {
                    image = Image(resources["/icons/settings.png"])
                }
            }
        }
    }

}