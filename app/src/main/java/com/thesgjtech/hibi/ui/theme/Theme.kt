package com.thesgjtech.hibi.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color.White,
    background = Color.DarkGray, // Fix: Use Color.DarkGray instead of DarkGray
    onBackground = Color.White,
    surface = Color.LightBlue, // Fix: Use Color.LightBlue instead of LightBlue
    onSurface = Color.DarkGray // Fix: Use Color.DarkGray instead of DarkGray
)

@Composable
fun HibiTheme(darkTheme: Boolean = true, content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
