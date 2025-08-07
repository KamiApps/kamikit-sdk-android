package com.kamiapps.kamikit.core.colors

// =====================================================
// 2. SystemColors.kt - iOS System Colors

import androidx.compose.ui.graphics.Color

object SystemColors {
    // MARK: - Basic Colors (iOS'teki gibi)
    val red = SemanticColor(
        light = Color(255,56,60,255),
        dark = Color(255,66,69,255)
    )

    val orange = SemanticColor(
        light = Color(0xFFFF9500),
        dark = Color(0xFFFF9F0A)
    )

    val yellow = SemanticColor(
        light = Color(0xFFFFCC00),
        dark = Color(0xFFFFD60A)
    )

    val green = SemanticColor(
        light = Color(0xFF34C759),
        dark = Color(0xFF32D74B)
    )

    val mint = SemanticColor(
        light = Color(0xFF00C7BE),
        dark = Color(0xFF63E6E2)
    )

    val teal = SemanticColor(
        light = Color(0xFF30B0C7),
        dark = Color(0xFF40CBE0)
    )

    val cyan = SemanticColor(
        light = Color(0xFF32ADE6),
        dark = Color(0xFF64D2FF)
    )

    val blue = SemanticColor(
        light = Color(0xFF007AFF),
        dark = Color(0xFF0A84FF)
    )

    val indigo = SemanticColor(
        light = Color(0xFF5856D6),
        dark = Color(0xFF5E5CE6)
    )

    val purple = SemanticColor(
        light = Color(0xFFAF52DE),
        dark = Color(0xFFBF5AF2)
    )

    val pink = SemanticColor(
        light = Color(0xFFFF2D92),
        dark = Color(0xFFFF375F)
    )

    val brown = SemanticColor(
        light = Color(0xFFA2845E),
        dark = Color(0xFFAC8E68)
    )

    // MARK: - Gray Scale
    val black = SemanticColor(
        light = Color(0xFF000000),
        dark = Color(0xFF000000)
    )

    val gray = SemanticColor(
        light = Color(0xFF8E8E93),
        dark = Color(0xFF8E8E93)
    )

    val gray2 = SemanticColor(
        light = Color(0xFFAEAEB2),
        dark = Color(0xFF636366)
    )

    val gray3 = SemanticColor(
        light = Color(0xFFC7C7CC),
        dark = Color(0xFF48484A)
    )

    val gray4 = SemanticColor(
        light = Color(0xFFD1D1D6),
        dark = Color(0xFF3A3A3C)
    )

    val gray5 = SemanticColor(
        light = Color(0xFFE5E5EA),
        dark = Color(0xFF2C2C2E)
    )

    val gray6 = SemanticColor(
        light = Color(0xFFF2F2F7),
        dark = Color(0xFF1C1C1E)
    )

    val white = SemanticColor(
        light = Color(0xFFFFFFFF),
        dark = Color(0xFFFFFFFF)
    )
}

