package com.kamiapps.kamikit.core.colors

import androidx.compose.ui.graphics.Color

object TextColors {
    val primary = SemanticColor(
        light = Color(0xFF000000),
        dark = Color(0xFFFFFFFF)
    )

    val secondary = SemanticColor(
        light = Color(0xFF3C3C43).copy(alpha = 0.6f),
        dark = Color(0xFFEBEBF5).copy(alpha = 0.6f)
    )

    val tertiary = SemanticColor(
        light = Color(0xFF3C3C43).copy(alpha = 0.3f),
        dark = Color(0xFFEBEBF5).copy(alpha = 0.3f)
    )

    val quaternary = SemanticColor(
        light = Color(0xFF3C3C43).copy(alpha = 0.18f),
        dark = Color(0xFFEBEBF5).copy(alpha = 0.16f)
    )
}
