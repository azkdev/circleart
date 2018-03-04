package com.azkdev.circleart.view

import tornadofx.*

class RecentScketchesView : View() {

    val someData = listOf("One", "Two", "Three", "Four", "Five", "Six", "Seven")

    override val root = datagrid(someData) {
        style {
            prefWidth = 400.px
        }
    }

}