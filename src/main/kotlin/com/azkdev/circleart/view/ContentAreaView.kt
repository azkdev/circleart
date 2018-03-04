package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import tornadofx.*

class ContentAreaView : View() {

    override val root = hbox {
        addClass(Styles.contentarea)

        this += RecentScketchesView::class
    }

}