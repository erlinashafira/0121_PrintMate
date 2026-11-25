package com.example.printmate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.printmate.navigation.PrintMateNavGraph
import com.example.printmate.ui.theme.PrintMateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrintMateTheme {
                val navController = rememberNavController()
                PrintMateNavGraph(navController = navController)
            }
        }
    }
}

