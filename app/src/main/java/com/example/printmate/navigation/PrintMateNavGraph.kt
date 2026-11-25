package com.example.printmate.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun PrintMateNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(Screen.Login.route) {
            PlaceholderScreen(
                title = "Halaman Login PrintMate",
                buttonText = "Masuk ke Beranda (Sementara)",
                onClick = { navController.navigate(Screen.Home.route) }
            )
        }
        composable(Screen.Home.route) {
            PlaceholderScreen(
                title = "Beranda PrintMate",
                buttonText = "Kembali ke Login",
                onClick = { navController.popBackStack() }
            )
        }
    }
}

@Composable
private fun PlaceholderScreen(title: String, buttonText: String, onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = title, style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onClick) {
            Text(text = buttonText)
        }
    }
}