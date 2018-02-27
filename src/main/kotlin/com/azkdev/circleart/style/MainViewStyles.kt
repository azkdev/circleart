package com.azkdev.circleart.style

import tornadofx.Stylesheet
import tornadofx.cssclass
import tornadofx.px

class MainViewStyles : Stylesheet() {
    companion object {
        val wrapper by cssclass()
    }

    init {
        s(wrapper) {
            padding = tornadofx.box(30.px)
            spacing = 30.px
        }
    }
}