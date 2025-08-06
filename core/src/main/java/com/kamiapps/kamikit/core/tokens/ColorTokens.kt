package com.kamiapps.kamikit.core.tokens

import androidx.compose.ui.graphics.Color

// Adlandırmalar sende. İstersen marka temelli isimlendir.
data class ColorTokens(
    val primary: Color,
    val onPrimary: Color,
    val secondary: Color,
    val onSecondary: Color,
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val error: Color,
    val onError: Color,
    // İhtiyaca göre ekle (tertiary, outline, surfaceVariant, vb.)
)