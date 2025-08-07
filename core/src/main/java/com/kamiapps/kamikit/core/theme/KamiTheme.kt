package com.kamiapps.kamikit.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import com.kamiapps.kamikit.core.colors.KamiColorSystem
import com.kamiapps.kamikit.core.colors.LocalKamiColorSystem

@Composable
fun KamiTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorSystem = KamiColorSystem(isDark = darkTheme)

    CompositionLocalProvider(
        LocalKamiColorSystem provides colorSystem
    ) {
        content()
    }
}

/**
 * iOS benzeri KamiTheme object - static erişim için
 */
object KamiTheme {
    val color: KamiColorSystem
        @Composable @ReadOnlyComposable get() = LocalKamiColorSystem.current
}

