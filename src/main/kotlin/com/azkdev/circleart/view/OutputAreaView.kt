package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import javafx.geometry.Insets
import tornadofx.*

class OutputAreaView : View() {

    override val root = borderpane {
        addClass(Styles.outputarea)

        left {
            padding = Insets(10.0)
            text("Some useful output...") {
                addClass(Styles.outputtext)
            }
        }
    }

}