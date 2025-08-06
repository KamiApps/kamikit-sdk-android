package com.kamiapps.kamikit.core.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import com.kamiapps.kamikit.core.tokens.ColorTokens

fun toLightColorScheme(t: ColorTokens): ColorScheme = lightColorScheme(
    primary = t.primary,
    onPrimary = t.onPrimary,
    secondary = t.secondary,
    onSecondary = t.onSecondary,
    background = t.background,
    onBackground = t.onBackground,
    surface = t.surface,
    onSurface = t.onSurface,
    error = t.error,
    onError = t.onError
)

fun toDarkColorScheme(t: ColorTokens): ColorScheme = darkColorScheme(
    primary = t.primary,
    onPrimary = t.onPrimary,
    secondary = t.secondary,
    onSecondary = t.onSecondary,
    background = t.background,
    onBackground = t.onBackground,
    surface = t.surface,
    onSurface = t.onSurface,
    error = t.error,
    onError = t.onError
)
