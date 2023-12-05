package com.example.roomsiswa.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.roomsiswa.ui.theme.DestinasiEntry
import com.example.roomsiswa.ui.theme.DestinasiHome
import com.example.roomsiswa.ui.theme.EntrySiswaScreen
import com.example.roomsiswa.ui.theme.HomeScreen

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController =navController, startDestination = DestinasiHome.route, modifier = Modifier)
    {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
            )
        }
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }
    }
}