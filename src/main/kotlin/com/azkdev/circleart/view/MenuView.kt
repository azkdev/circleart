package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import javafx.application.Platform
import tornadofx.View
import tornadofx.addClass
import tornadofx.stackpane
import tornadofx.vbox

class MenuView : View() {

    private var offX: Double = 0.0
    private var offY: Double = 0.0

    override val root = vbox {
        addClass(Styles.menuwnd)

        setOnMousePressed {
            offX = primaryStage.x - it.screenX
            offY = primaryStage.y - it.screenY
        }

        setOnMouseDragged {
            primaryStage.x = it.screenX + offX
            primaryStage.y = it.screenY + offY
        }

        stackpane {
            addClass(Styles.menuitem)
            addClass(Styles.powerbtn)

            setOnMouseClicked {
                Platform.exit()
            }
        }

        stackpane {
            addClass(Styles.menuitem)
            addClass(Styles.newbtn)
        }

        stackpane {
            addClass(Styles.menuitem)
            addClass(Styles.playbtn)
        }

        stackpane {
            addClass(Styles.menuitem)
            addClass(Styles.pausebtn)
        }

        stackpane {
            addClass(Styles.menuitem)
            addClass(Styles.settingsbtn)
        }
    }

}