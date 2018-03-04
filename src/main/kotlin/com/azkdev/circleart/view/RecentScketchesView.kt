package com.azkdev.circleart.view

import tornadofx.*

class RecentScketchesView : View() {

    val someData = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    override val root = datagrid(someData) {
        horizontalCellSpacing = 5.0
        verticalCellSpacing = 5.0
    }

}