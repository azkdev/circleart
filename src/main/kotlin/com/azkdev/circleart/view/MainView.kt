package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import tornadofx.*

class MainView : View("Circles") {

    override val root = hbox {
        addClass(Styles.appwnd)

        vbox {
            addClass(Styles.canvaswnd)

            canvas(500.0, 500.0) {
                graphicsContext2D.fill = c("#FFFFFF")
                graphicsContext2D.fillRect(0.0, 0.0, width, height)
                graphicsContext2D.fill = c("#FF0000")
                (0..10).forEach {
                    val r: Double = Math.random() * 10
                    graphicsContext2D.fillOval(Math.random() * width, Math.random() * height, r, r)
                }
            }

            hbox {
                prefHeight = 50.0
                stackpane {
                    addClass(Styles.menuitem)
                    addClass(Styles.powerbtn)
                }
            }
        }

        this += MenuView::class
    }

}