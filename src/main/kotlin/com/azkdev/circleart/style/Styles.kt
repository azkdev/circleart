package com.azkdev.circleart.style

import javafx.geometry.Pos
import tornadofx.*

class Styles : Stylesheet() {

    companion object {
        val appwnd by cssclass()
        val menubar by cssclass()
        val contentarea by cssclass()
        val outputarea by cssclass()

        val transparentc = c("#000000", 0.0)
        val backgroundc = c("#343434")
    }

    init {
        appwnd {
            prefWidth = 900.px
            prefHeight = 600.px
            spacing = 10.px
            backgroundColor += transparentc
        }

        menubar {
            prefWidth = 100.pc
            prefHeight = 40.px
            backgroundColor += backgroundc
        }

        contentarea {
            prefWidth = 100.pc
            prefHeight = 500.px
            backgroundColor += backgroundc
        }

        outputarea {
            prefWidth = 100.pc
            prefHeight = 40.px
            backgroundColor += backgroundc
        }
    }

}