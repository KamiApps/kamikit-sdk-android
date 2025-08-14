package com.kamiapps.kamikit.core.colors

import androidx.compose.ui.graphics.Color

object BackgroundColors {
    // MARK: - Solid Backgrounds
    val primary = SemanticColor(
        light = Color(255,255,255,255),
        dark = Color(0,0,0,255)
    )

    val secondary = SemanticColor(
        light = Color(242,242,247,255),
        dark = Color(28,28,30,255)
    )

    val tertiary = SemanticColor(
        light = Color(255,255,255,255),
        dark = Color(44,44,46,255)
    )

    // MARK: - Elevated Backgrounds (iOS'teki elevated sistem)
    val elevatedPrimary = SemanticColor(
        light = Color(255,255,255,255),
        dark = Color(28,28,30,255)
    )

    val elevatedSecondary = SemanticColor(
        light = Color(242,242,247,255),
        dark = Color(44,44,46,255)
    )

    val elevatedTertiary = SemanticColor(
        light = Color(255,255,255,255),
        dark = Color(58,28,60,255)
    )
}
