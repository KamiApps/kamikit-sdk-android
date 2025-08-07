package com.kamiapps.kamikit.core.colors

import androidx.compose.ui.graphics.Color

object BackgroundColors {
    // MARK: - Solid Backgrounds
    val primary = SemanticColor(
        light = Color(255,255,255,255),
        dark = Color(0xFF000000)
    )

    val secondary = SemanticColor(
        light = Color(0xFFF2F2F7),
        dark = Color(0xFF1C1C1E)
    )

    val tertiary = SemanticColor(
        light = Color(0xFFFFFFFF),
        dark = Color(0xFF2C2C2E)
    )

    // MARK: - Elevated Backgrounds (iOS'teki elevated sistem)
    val elevatedPrimary = SemanticColor(
        light = Color(0xFFFFFFFF),
        dark = Color(0xFF1C1C1E)
    )

    val elevatedSecondary = SemanticColor(
        light = Color(0xFFF2F2F7),
        dark = Color(0xFF2C2C2E)
    )

    val elevatedTertiary = SemanticColor(
        light = Color(0xFFFFFFFF),
        dark = Color(0xFF3A3A3C)
    )

    // MARK: - Base Backgrounds (iOS'teki base sistem)
    val basePrimary = SemanticColor(
        light = Color(0xFFFFFFFF),
        dark = Color(0xFF000000)
    )

    val baseSecondary = SemanticColor(
        light = Color(0xFFF2F2F7),
        dark = Color(0xFF1C1C1E)
    )

    val baseTertiary = SemanticColor(
        light = Color(0xFFFFFFFF),
        dark = Color(0xFF2C2C2E)
    )
}
