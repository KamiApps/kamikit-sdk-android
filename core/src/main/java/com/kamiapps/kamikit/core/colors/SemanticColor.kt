package com.kamiapps.kamikit.core.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import com.kamiapps.kamikit.core.theme.KamiTheme

@Immutable
data class SemanticColor(
    val light: Color,
    val dark: Color
) {
    fun resolve(isDark: Boolean): Color = if (isDark) dark else light

    // Direct access properties
    fun current(isDark: Boolean): Color = resolve(isDark)
}