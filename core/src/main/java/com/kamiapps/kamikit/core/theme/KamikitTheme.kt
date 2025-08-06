package com.kamiapps.kamikit.core.theme
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.kamiapps.kamikit.core.tokens.KamiTokens
import com.kamiapps.kamikit.core.tokens.ColorTokens
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography

@Composable
fun KamikitTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),

    // Varsayılanlar: Kendi belirlediğin setler
    colorsLight: ColorTokens = KamiTokens.LightColors,
    colorsDark: ColorTokens = KamiTokens.DarkColors,
    typography: Typography = KamiTokens.Typography,
    shapes: Shapes = KamiTokens.Shapes,

    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) toDarkColorScheme(colorsDark) else toLightColorScheme(colorsLight)

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
