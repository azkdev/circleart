package com.azkdev.circleart.style

import javafx.scene.layout.BackgroundPosition
import javafx.scene.layout.BackgroundRepeat
import tornadofx.*
import java.net.URI

class Styles : Stylesheet() {

    companion object {
        val appwnd by cssclass()
        val canvaswnd by cssclass()
        val menuwnd by cssclass()
        val menuitem by cssclass()
        val powerbtn by cssclass()
        val newbtn by cssclass()
        val playbtn by cssclass()
        val pausebtn by cssclass()
        val settingsbtn by cssclass()

        val transparentc = c("#000000", 0.0)
        val whitec = c("#FFFFFF")
        val redc = c("#D52735")
        val bluec = c("#028FBF")
    }

    init {
        appwnd {
            prefWidth = 560.px
            prefHeight = 560.px
            spacing = 10.px
            backgroundColor += transparentc
        }

        canvaswnd {
            spacing = 10.px
            backgroundColor += transparentc
        }

        menuwnd {
            prefWidth = 50.px
            spacing = 10.px
            backgroundColor += transparentc
        }

        menuitem {
            prefWidth = 50.px
            prefHeight = 50.px
            backgroundPosition += BackgroundPosition.CENTER
            backgroundRepeat += Pair(BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT)
            backgroundRadius += box(25.pc)
        }

        powerbtn {
            backgroundColor += redc
            backgroundImage += URI.create("/icons/power.png")
            and(hover) {
                backgroundImage += URI.create("/icons/powerwhite.png")
            }
        }

        newbtn {
            backgroundColor += whitec
            backgroundImage += URI.create("/icons/new.png")
            and(hover) {
                backgroundColor += bluec
                backgroundImage += URI.create("/icons/newwhite.png")
            }
        }

        playbtn {
            backgroundColor += whitec
            backgroundImage += URI.create("/icons/play.png")
            and(hover) {
                backgroundColor += bluec
                backgroundImage += URI.create("/icons/playwhite.png")
            }
        }

        pausebtn {
            backgroundColor += whitec
            backgroundImage += URI.create("/icons/pause.png")
            and(hover) {
                backgroundColor += bluec
                backgroundImage += URI.create("/icons/pausewhite.png")
            }
        }

        settingsbtn {
            backgroundColor += whitec
            backgroundImage += URI.create("/icons/settings.png")
            and(hover) {
                backgroundColor += bluec
                backgroundImage += URI.create("/icons/settingswhite.png")
            }
        }
    }

}