package com.kamiapps.kamikit.core.colors

// =====================================================
// 2. SystemColors.kt - iOS System Colors

import androidx.compose.ui.graphics.Color

object SystemColors {
    // MARK: - Basic Colors (iOS)
    val red = SemanticColor(
        light = Color(255, 56, 60, 255),
        dark = Color(255, 66, 69, 255)
    )

    val orange = SemanticColor(
        light = Color(255, 141, 40, 255),
        dark = Color(255, 146, 48, 255)
    )

    val yellow = SemanticColor(
        light = Color(255, 204, 0, 255),
        dark = Color(255, 214, 0, 255)
    )

    val green = SemanticColor(
        light = Color(52, 199, 89, 255),
        dark = Color(48, 209, 88, 255)
    )

    val mint = SemanticColor(
        light = Color(0, 200, 179, 255),
        dark = Color(0, 218, 195, 255)
    )

    val teal = SemanticColor(
        light = Color(0, 195, 208, 255),
        dark = Color(0, 210, 224, 255)
    )

    val cyan = SemanticColor(
        light = Color(0, 192, 232, 255),
        dark = Color(60, 211, 254)
    )

    val blue = SemanticColor(
        light = Color(0, 136, 255, 255),
        dark = Color(0, 145, 255, 255)
    )

    val indigo = SemanticColor(
        light = Color(97, 85, 245, 255),
        dark = Color(107, 93, 255, 255)
    )

    val purple = SemanticColor(
        light = Color(203, 48, 224, 255),
        dark = Color(219, 52, 242, 255)
    )

    val pink = SemanticColor(
        light = Color(255, 45, 85, 255),
        dark = Color(255, 55, 95, 255)
    )

    val brown = SemanticColor(
        light = Color(172, 127, 94, 255),
        dark = Color(183, 138, 102, 255)
    )

    // MARK: - Gray Scale
    val black = SemanticColor(
        light = Color(0, 0, 0, 255),
        dark = Color(0, 0, 0, 255)
    )

    val gray = SemanticColor(
        light = Color(142, 142, 147, 255),
        dark = Color(142, 142, 147, 255)
    )

    val gray2 = SemanticColor(
        light = Color(174, 174, 178, 255),
        dark = Color(99, 99, 102, 255)
    )

    val gray3 = SemanticColor(
        light = Color(199, 199, 204, 255),
        dark = Color(72, 72, 74, 255)
    )

    val gray4 = SemanticColor(
        light = Color(209, 209, 214, 255),
        dark = Color(58, 58, 60, 255)
    )

    val gray5 = SemanticColor(
        light = Color(229, 229, 234, 255),
        dark = Color(44, 44, 46, 255)
    )

    val gray6 = SemanticColor(
        light = Color(242, 242, 247, 255),
        dark = Color(28, 28, 30, 255)
    )

    val white = SemanticColor(
        light = Color(255, 255, 255, 255),
        dark = Color(255, 255, 255, 255)
    )
}

