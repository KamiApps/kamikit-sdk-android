package com.kamiapps.kamikit.core.colors

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.ui.graphics.Color

@Immutable
class KamiColorSystem(
    private val isDark: Boolean = false
) {
    // System Colors - Doğrudan Color döndürür
    val red: Color get() = SystemColors.red.resolve(isDark)
    val orange: Color get() = SystemColors.orange.resolve(isDark)
    val yellow: Color get() = SystemColors.yellow.resolve(isDark)
    val green: Color get() = SystemColors.green.resolve(isDark)
    val mint: Color get() = SystemColors.mint.resolve(isDark)
    val teal: Color get() = SystemColors.teal.resolve(isDark)
    val cyan: Color get() = SystemColors.cyan.resolve(isDark)
    val blue: Color get() = SystemColors.blue.resolve(isDark)
    val indigo: Color get() = SystemColors.indigo.resolve(isDark)
    val purple: Color get() = SystemColors.purple.resolve(isDark)
    val pink: Color get() = SystemColors.pink.resolve(isDark)
    val brown: Color get() = SystemColors.brown.resolve(isDark)

    // Grays
    val black: Color get() = SystemColors.black.resolve(isDark)
    val gray: Color get() = SystemColors.gray.resolve(isDark)
    val gray2: Color get() = SystemColors.gray2.resolve(isDark)
    val gray3: Color get() = SystemColors.gray3.resolve(isDark)
    val gray4: Color get() = SystemColors.gray4.resolve(isDark)
    val gray5: Color get() = SystemColors.gray5.resolve(isDark)
    val gray6: Color get() = SystemColors.gray6.resolve(isDark)
    val white: Color get() = SystemColors.white.resolve(isDark)

    // Backgrounds
    val backgroundPrimary: Color get() = BackgroundColors.primary.resolve(isDark)
    val backgroundSecondary: Color get() = BackgroundColors.secondary.resolve(isDark)
    val backgroundTertiary: Color get() = BackgroundColors.tertiary.resolve(isDark)

    val backgroundElevatedPrimary: Color get() = BackgroundColors.elevatedPrimary.resolve(isDark)
    val backgroundElevatedSecondary: Color get() = BackgroundColors.elevatedSecondary.resolve(isDark)
    val backgroundElevatedTertiary: Color get() = BackgroundColors.elevatedTertiary.resolve(isDark)


    // Grouped Backgrounds
    val backgroundGroupedPrimary: Color get() = GroupedBackgroundColors.primary.resolve(isDark)
    val backgroundGroupedSecondary: Color get() = GroupedBackgroundColors.secondary.resolve(isDark)
    val backgroundGroupedTertiary: Color get() = GroupedBackgroundColors.tertiary.resolve(isDark)

    val backgroundGroupedElevatedPrimary: Color get() = GroupedBackgroundColors.elevatedPrimary.resolve(isDark)
    val backgroundGroupedElevatedSecondary: Color get() = GroupedBackgroundColors.elevatedSecondary.resolve(isDark)
    val backgroundGroupedElevatedTertiary: Color get() = GroupedBackgroundColors.elevatedTertiary.resolve(isDark)


    // Text Colors
    val textPrimary: Color get() = TextColors.primary.resolve(isDark)
    val textSecondary: Color get() = TextColors.secondary.resolve(isDark)
    val textTertiary: Color get() = TextColors.tertiary.resolve(isDark)
    val textQuaternary: Color get() = TextColors.quaternary.resolve(isDark)

    // Separators
    val separatorOpaque: Color get() = SeparatorColors.opaque.resolve(isDark)
    val separatorNonOpaque: Color get() = SeparatorColors.nonOpaque.resolve(isDark)

    // Eğer kullanıcı spesifik olarak dark/light istiyorsa
    object Raw {
        val red = SystemColors.red
        val orange = SystemColors.orange
        val yellow = SystemColors.yellow
        val green = SystemColors.green
        val mint = SystemColors.mint
        val teal = SystemColors.teal
        val cyan = SystemColors.cyan
        val blue = SystemColors.blue
        val indigo = SystemColors.indigo
        val purple = SystemColors.purple
        val pink = SystemColors.pink
        val brown = SystemColors.brown

        val black = SystemColors.black
        val gray = SystemColors.gray
        val gray2 = SystemColors.gray2
        val gray3 = SystemColors.gray3
        val gray4 = SystemColors.gray4
        val gray5 = SystemColors.gray5
        val gray6 = SystemColors.gray6
        val white = SystemColors.white

        val backgroundPrimary = BackgroundColors.primary
        val backgroundSecondary = BackgroundColors.secondary
        val backgroundTertiary = BackgroundColors.tertiary

        val textPrimary = TextColors.primary
        val textSecondary = TextColors.secondary
        val textTertiary = TextColors.tertiary
        val textQuaternary = TextColors.quaternary

        val separatorOpaque = SeparatorColors.opaque
        val separatorNonOpaque = SeparatorColors.nonOpaque
    }
}

// CompositionLocal
val LocalKamiColorSystem = staticCompositionLocalOf { KamiColorSystem() }

