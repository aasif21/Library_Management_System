package com.example.library_management_system.presentation.navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.library_management_system.presentation.UI.bottombar.AppNavigation
import com.example.library_management_system.presentation.UI.Authentication.login.LoginScreen
import com.example.library_management_system.presentation.UI.Authentication.signup.SignupScreen

@Composable
fun RootNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(Screen.Login.route) {
            LoginScreen(navController)
        }
        composable(Screen.Signup.route) {
            SignupScreen(navController)
        }
        composable(Screen.MainApp.route) {
            AppNavigation(navController)
        }
    }
}


sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Signup : Screen("signup")
    object MainApp : Screen("mainApp")
}