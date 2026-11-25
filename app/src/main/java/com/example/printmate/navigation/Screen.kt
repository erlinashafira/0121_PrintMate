package com.example.printmate.navigation

sealed class Screen(val route: String) {
    data object Login : Screen("login")
    data object Register : Screen("register")
    data object Home : Screen("home")
    data object Categories : Screen("categories")
    data object RawMaterials : Screen("raw_materials")
    data object Products : Screen("products")
    data object Customers : Screen("customers")
    data object Orders : Screen("orders")
}