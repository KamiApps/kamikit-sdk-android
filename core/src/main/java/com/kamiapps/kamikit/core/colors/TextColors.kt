package com.kamiapps.kamikit.core.colors

import androidx.compose.ui.graphics.Color

object TextColors {
    val primary = SemanticColor(
        light = Color(0,0,0, 255),
        dark = Color(255,255,255, 255)
    )

    val secondary = SemanticColor(
        light = Color(60, 60, 67, 153),
        dark = Color(235, 235, 245, 153)
    )

    val tertiary = SemanticColor(
        light = Color(60, 60, 67, 77),
        dark = Color(235, 235, 245, 77)
    )

    val quaternary = SemanticColor(
        light = Color(60, 60, 67, 46),
        dark = Color(235, 235, 245, 41)
    )
}
