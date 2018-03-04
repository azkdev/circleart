package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import tornadofx.*

class ContentAreaView : View() {

    override val root = borderpane {
        addClass(Styles.contentarea)

        center {
            canvas(500.0, 500.0) {
                graphicsContext2D.fill = c("#FFFFFF")
                graphicsContext2D.fillRect(0.0, 0.0, width, height)
            }
        }

        right {
            this += RecentScketchesView::class
        }
    }

}