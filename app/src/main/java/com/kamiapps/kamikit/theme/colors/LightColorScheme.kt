package com.kamiapps.kamikit.theme.colors


import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val KamiLightColorScheme = lightColorScheme(
    primary = KamiColors.Primary500,
    onPrimary = Color.White,
    primaryContainer = KamiColors.Primary100,
    onPrimaryContainer = KamiColors.Primary900,

    secondary = KamiColors.Secondary500,
    onSecondary = Color.White,
    secondaryContainer = KamiColors.Secondary100,
    onSecondaryContainer = KamiColors.Secondary900,

    tertiary = KamiColors.Primary300,
    onTertiary = KamiColors.Primary800,
    tertiaryContainer = KamiColors.Primary50,
    onTertiaryContainer = KamiColors.Primary900,

    error = KamiColors.Error500,
    onError = Color.White,
    errorContainer = KamiColors.Error100,
    onErrorContainer = KamiColors.Error700,

    background = Color.White,
    onBackground = KamiColors.Neutral900,
    surface = Color.White,
    onSurface = KamiColors.Neutral900,

    surfaceVariant = KamiColors.Neutral100,
    onSurfaceVariant = KamiColors.Neutral700,
    outline = KamiColors.Neutral300,
    outlineVariant = KamiColors.Neutral200,

    scrim = Color.Black.copy(alpha = 0.32f),
    inverseSurface = KamiColors.Neutral900,
    inverseOnSurface = KamiColors.Neutral100,
    inversePrimary = KamiColors.Primary300,

    surfaceDim = KamiColors.Neutral100,
    surfaceBright = Color.White,
    surfaceContainerLowest = Color.White,
    surfaceContainerLow = KamiColors.Neutral50,
    surfaceContainer = KamiColors.Neutral100,
    surfaceContainerHigh = KamiColors.Neutral200,
    surfaceContainerHighest = KamiColors.Neutral300
)