package com.azkdev.circleart.style

import javafx.scene.layout.BackgroundPosition
import javafx.scene.layout.BackgroundRepeat
import javafx.scene.text.FontWeight
import tornadofx.*
import java.net.URI

class Styles : Stylesheet() {

    companion object {
        val appwnd by cssclass()
        val menubar by cssclass()
        val contentarea by cssclass()
        val outputarea by cssclass()
        val menubaritems by cssclass()
        val btnnew by cssclass()
        val btnplay by cssclass()
        val btnpause by cssclass()
        val btnsave by cssclass()
        val btnsettings by cssclass()
        val apptitle by cssclass()
        val btnclose by cssclass()

        val transparentc = c("#000000", 0.0)
        val backgroundc = c("#343434")

        val mainbgc = mixin {
            backgroundColor += backgroundc
        }
        val topbottbar = mixin {
            prefWidth = 100.pc
            prefHeight = 40.px
        }
        val menubaritem = mixin {
            prefWidth = 40.px
            prefHeight = 40.px
            backgroundPosition += BackgroundPosition.CENTER
            backgroundRepeat += Pair(BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT)
        }
    }

    init {
        appwnd {
            prefWidth = 900.px
            prefHeight = 600.px
            spacing = 10.px
            backgroundColor += transparentc
        }

        menubar {
            +topbottbar
            +mainbgc
        }

        menubaritems {
            spacing = 10.px
        }

        btnnew {
            +menubaritem
            backgroundImage += URI.create("/icons/newwhite.png")
        }

        btnplay {
            +menubaritem
            backgroundImage += URI.create("/icons/playwhite.png")
        }

        btnpause {
            +menubaritem
            backgroundImage += URI.create("/icons/pausewhite.png")
        }

        btnsave {
            +menubaritem
            backgroundImage += URI.create("/icons/savewhite.png")
        }

        btnsettings {
            +menubaritem
            backgroundImage += URI.create("/icons/settingswhite.png")
        }

        apptitle {
            fontSize = 18.px
            fontWeight = FontWeight.SEMI_BOLD
            fill = c("#FFFFFF")
        }

        btnclose {
            +menubaritem
            backgroundImage += URI.create("/icons/powerwhite.png")
        }

        contentarea {
            prefWidth = 100.pc
            prefHeight = 500.px
            +mainbgc
        }

        outputarea {
            +topbottbar
            +mainbgc
        }
    }

}