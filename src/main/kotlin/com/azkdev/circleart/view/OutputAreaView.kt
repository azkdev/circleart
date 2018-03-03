package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import javafx.scene.Parent
import tornadofx.*

class OutputAreaView : View() {

    override val root = hbox {
        addClass(Styles.outputarea)
    }

}