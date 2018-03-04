package com.azkdev.circleart.view

import tornadofx.*

class RecentScketchesView : View() {

    private var someData = listOf<String>()

    private fun genList(): List<String> {
        (0..20).forEach { someData += "$it" }
        return someData
    }

    override val root = datagrid(genList()) {
        horizontalCellSpacing = 5.0
        verticalCellSpacing = 5.0
    }

}