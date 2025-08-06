package com.kamiapps.kamikit.core.tokens


import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Typography as M3Typography

object KamiTokens {

    // 1) RENKLER — bunları SEN dolduracaksın
    val LightColors = ColorTokens(
        primary      = Color(0xFF000000), // TODO
        onPrimary    = Color(0xFFFFFFFF), // TODO
        secondary    = Color(0xFF000000), // TODO
        onSecondary  = Color(0xFFFFFFFF), // TODO
        background   = Color(0xFFFFFFFF), // TODO
        onBackground = Color(0xFF000000), // TODO
        surface      = Color(0xFFFFFFFF), // TODO
        onSurface    = Color(0xFF000000), // TODO
        error        = Color(0xFFB00020), // TODO
        onError      = Color(0xFFFFFFFF)  // TODO
    )

    val DarkColors = ColorTokens(
        primary      = Color(0xFFFFFFFF), // TODO
        onPrimary    = Color(0xFF000000), // TODO
        secondary    = Color(0xFFFFFFFF), // TODO
        onSecondary  = Color(0xFF000000), // TODO
        background   = Color(0xFF000000), // TODO
        onBackground = Color(0xFFFFFFFF), // TODO
        surface      = Color(0xFF121212), // TODO
        onSurface    = Color(0xFFFFFFFF), // TODO
        error        = Color(0xFFCF6679), // TODO
        onError      = Color(0xFF000000)  // TODO
    )

    // 2) TYPOGRAPHY — direkt Material3 Typography kullan
    val Typography: Typography = M3Typography(
        // TODO: displayLarge = ..., bodyMedium = ..., vb. (TextStyle’ları doldur)
    )

    // 3) SHAPES — köşe yarıçapları
    val Shapes: Shapes = Shapes(
        small  = RoundedCornerShape(4.dp),  // TODO
        medium = RoundedCornerShape(8.dp),  // TODO
        large  = RoundedCornerShape(16.dp)  // TODO
    )

    // 4) SPACING — sayısal token’lar
    val Spacing = SpacingTokens(
        xs = 4,   // TODO
        sm = 8,
        md = 12,
        lg = 16,
        xl = 24
    )
}
