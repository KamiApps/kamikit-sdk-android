package com.kamiapps.kamikit.core.colors

import androidx.compose.ui.graphics.Color

object SeparatorColors {
    val opaque = SemanticColor(
        light = Color(0xFFC6C6C8),
        dark = Color(0xFF38383A)
    )

    val nonOpaque = SemanticColor(
        light = Color(0xFF3C3C43).copy(alpha = 0.36f),
        dark = Color(0xFF545458).copy(alpha = 0.65f)
    )
}
