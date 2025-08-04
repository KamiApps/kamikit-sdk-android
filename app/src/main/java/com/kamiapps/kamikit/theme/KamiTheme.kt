package com.kamiapps.kamikit.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.kamiapps.kamikit.theme.colors.KamiDarkColorScheme
import com.kamiapps.kamikit.theme.colors.KamiLightColorScheme

/**
 * Kami Kit Ana Tema Composable'ı
 *
 * @param darkTheme Koyu tema kullanılacak mı (varsayılan: sistem ayarı)
 * @param dynamicColor Dinamik renk kullanılacak mı (varsayılan: false)
 * @param content Tema içeriği
 */
@Composable
fun KamiTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S -> {
            val context = androidx.compose.ui.platform.LocalContext.current
            if (darkTheme) {
                androidx.compose.material3.dynamicDarkColorScheme(context)
            } else {
                androidx.compose.material3.dynamicLightColorScheme(context)
            }
        }
        darkTheme -> KamiDarkColorScheme
        else -> KamiLightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = MaterialTheme.typography, // Gelecekte KamiTypography
        shapes = MaterialTheme.shapes,         // Gelecekte KamiShapes
        content = content
    )
}
