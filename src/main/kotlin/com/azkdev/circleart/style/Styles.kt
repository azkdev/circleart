package com.azkdev.circleart.style

import javafx.scene.layout.BackgroundPosition
import javafx.scene.layout.BackgroundRepeat
import tornadofx.*
import java.net.URI

class Styles : Stylesheet() {

    companion object {
        val appwindow by cssclass()
        val canvaswindow by cssclass()
        val menuwindow by cssclass()
        val menuitem by cssclass()
        val powerbtn by cssclass()
        val newbtn by cssclass()
        val playbtn by cssclass()
        val pausebtn by cssclass()
        val settingsbtn by cssclass()

        val transparentc = c("#000000", 0.0)
        val whitec = c("#FFFFFF")
        val redca = c("#EC4438")
        val redc = c("#D52735")
        val yellowca = c("#FFD951")
        val yellowc = c("#F8AE0C")
        val greenca = c("#67C02D")
        val greenc = c("#4FA01F")
        val bluec = c("#1760AA")
        val blueca = c("#3694D1")
    }

    init {
        appwindow {
            prefWidth = 560.px
            prefHeight = 500.px
            spacing = 10.px
            backgroundColor += transparentc
        }

        canvaswindow {
            prefWidth = 500.px
            fillHeight = true
            backgroundColor += whitec
        }

        menuwindow {
            prefWidth = 50.px
            spacing = 10.px
            backgroundColor += transparentc
        }

        menuitem {
            fillWidth = true
            prefHeight = 50.px
            backgroundPosition += BackgroundPosition.CENTER
            backgroundRepeat += Pair(BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT)
            backgroundRadius += box(25.pc)
        }

        powerbtn {
            backgroundColor += redc
            backgroundImage += URI.create("/icons/power.png")
            and(hover) {
                backgroundColor += redca
            }
        }

        newbtn {
            backgroundColor += yellowc
            backgroundImage += URI.create("/icons/new.png")
            and(hover) {
                backgroundColor += yellowca
            }
        }

        playbtn {
            backgroundColor += greenc
            backgroundImage += URI.create("/icons/play.png")
            and(hover) {
                backgroundColor += greenca
            }
        }

        pausebtn {
            backgroundColor += greenc
            backgroundImage += URI.create("/icons/pause.png")
            and(hover) {
                backgroundColor += greenca
            }
        }

        settingsbtn {
            backgroundColor += bluec
            backgroundImage += URI.create("/icons/settings.png")
            and(hover) {
                backgroundColor += blueca
            }
        }
    }

}