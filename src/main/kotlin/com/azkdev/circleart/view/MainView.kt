package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import tornadofx.*

class MainView : View("Circles") {

    override val root = vbox {
        addClass(Styles.appwnd)

        this += MenuBarView::class

        hbox {
            addClass(Styles.contentarea)
        }

        hbox {
            addClass(Styles.outputarea)
        }
    }

}