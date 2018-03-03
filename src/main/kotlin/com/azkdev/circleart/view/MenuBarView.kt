package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import tornadofx.*

class MenuBarView : View() {

    private var offX: Double = 0.0
    private var offY: Double = 0.0

    override val root = pane {
        addClass(Styles.menubar)

        setOnMousePressed {
            offX = primaryStage.x - it.screenX
            offY = primaryStage.y - it.screenY
        }

        setOnMouseDragged {
            primaryStage.x = it.screenX + offX
            primaryStage.y = it.screenY + offY
        }

        hbox {
            
        }

        pane {

        }
    }

}