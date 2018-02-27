package com.azkdev.circleart.view

import com.azkdev.circleart.style.MainViewStyles
import javafx.scene.layout.HBox
import tornadofx.*

class MainView : View() {

    init {
        importStylesheet(MainViewStyles::class)
    }

    override val root: HBox = hbox {
        addClass(MainViewStyles.wrapper)

        vbox {
            label("a")
            label("b")
            label("c")
            label("d")
        }

        label("Middle")

        vbox {
            label("1")
            label("2")
            label("3")
        }
    }

}