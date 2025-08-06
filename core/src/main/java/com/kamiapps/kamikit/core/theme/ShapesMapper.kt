package com.kamiapps.kamikit.core.theme


import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

fun toShapes(tokens: ShapeTokens): Shapes = Shapes(
    small = RoundedCornerShape(tokens.smallRadius.dp),
    medium = RoundedCornerShape(tokens.mediumRadius.dp),
    large = RoundedCornerShape(tokens.largeRadius.dp),
)
