package com.azkdev.circleart.view

import com.azkdev.circleart.style.Styles
import javafx.animation.Timeline
import javafx.scene.canvas.GraphicsContext
import tornadofx.*

class ContentAreaView : View() {

    override val root = borderpane {
        addClass(Styles.contentarea)

        center {
            canvas(500.0, 500.0) {
                graphicsContext2D.fill = c("#FFFFFF")
                graphicsContext2D.fillRect(0.0, 0.0, width, height)
                timeline {
                    keyframe(60.millis) {
                        createCircle(graphicsContext2D)
                    }
                }
            }
        }

        right {
            this += RecentScketchesView::class
        }
    }

    private fun createCircle(ctx: GraphicsContext) {
        ctx.fill = c((Math.random() * 255).toInt(), (Math.random() * 255).toInt(), (Math.random() * 255).toInt())
        ctx.fillOval(Math.random() * 500, Math.random() * 500, 50.0, 50.0)
        println("SSD")
    }

}