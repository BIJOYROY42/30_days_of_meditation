package com.example.a30daysofmeditation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30daysofmeditation.ui.screens.MeditationListScreen
import com.example.a30daysofmeditation.ui.theme._30DaysOfMeditationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysOfMeditationTheme {
                // Set up a basic scaffold with edge-to-edge support
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Show the meditation list screen
                    MeditationListScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    _30DaysOfMeditationTheme {
        MeditationListScreen()
    }
}