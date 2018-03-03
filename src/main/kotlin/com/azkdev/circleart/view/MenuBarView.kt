package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import javafx.application.Platform
import tornadofx.*

class MenuBarView : View() {

    private var offX: Double = 0.0
    private var offY: Double = 0.0

    override val root = borderpane {
        addClass(Styles.menubar)

        setOnMousePressed {
            offX = primaryStage.x - it.screenX
            offY = primaryStage.y - it.screenY
        }

        setOnMouseDragged {
            primaryStage.x = it.screenX + offX
            primaryStage.y = it.screenY + offY
        }

        left {
            hbox {
                addClass(Styles.menubaritems)

                pane {
                    addClass(Styles.btnnew)
                }

                pane {
                    addClass(Styles.btnplay)
                }

                pane {
                    addClass(Styles.btnpause)
                }

                pane {
                    addClass(Styles.btnsave)
                }

                pane {
                    addClass(Styles.btnsettings)
                }
            }
        }

        center {
            text("Circles pack art") {
                addClass(Styles.apptitle)
            }
        }

        right {
            pane {
                addClass(Styles.btnclose)

                setOnMouseClicked {
                    Platform.exit()
                }
            }
        }
    }

}