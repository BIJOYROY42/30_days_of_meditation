package com.example.a30daysofmeditation.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// Custom meditation app color scheme
private val DarkColorScheme = darkColorScheme(
    primary = DeepPurple,
    secondary = Lavender,
    tertiary = CalmBlue,
    background = DeepBlue,
    surface = DeepBlue,
    onPrimary = LightLavender,
    onSecondary = DeepBlue,
    onTertiary = LightLavender,
    onBackground = LightLavender,
    onSurface = LightLavender
)

private val LightColorScheme = lightColorScheme(
    primary = DeepPurple,
    secondary = Lavender,
    tertiary = CalmBlue,
    background = MeditationBackground,
    surface = LightLavender,
    onPrimary = LightLavender,
    onSecondary = DeepBlue,
    onTertiary = LightLavender,
    onBackground = DeepBlue,
    onSurface = DeepBlue
)

@Composable
fun _30DaysOfMeditationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
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
        typography = Typography,
        shapes = MeditationShapes,
        content = content
    )
}