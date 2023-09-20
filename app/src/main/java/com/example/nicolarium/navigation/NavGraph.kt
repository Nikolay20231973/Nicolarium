package com.example.nicolarium.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nicolarium.screens.eight_8.EightScreen
import com.example.nicolarium.screens.five_5.FiveScreen
import com.example.nicolarium.screens.fourth_4.FourthScreen
import com.example.nicolarium.screens.nine_9.NineScreen
import com.example.nicolarium.screens.one_1.OneScreen
import com.example.nicolarium.screens.six_6.SixScreen
import com.example.nicolarium.screens.ten_10.TenScreen
import com.example.nicolarium.screens.three_3.ThreeScreen
import com.example.nicolarium.screens.two_2.TwoScreen
import com.example.nicolarium.screens.seven_7.SevenScreen


@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.One.route)
    {
        composable(route = Screens.Three.route){
            ThreeScreen (navController)
        }
        composable(route = Screens.Two.route){
            TwoScreen(navController)
        }
        composable(route = Screens.One.route){
            OneScreen(navController)
        }
        composable(route = Screens.Fourth.route){
            FourthScreen(navController)
        }
        composable(route = Screens.Five.route){
            FiveScreen(navController)
        }
        composable(route = Screens.Six.route){
            SixScreen(navController)
        }
        composable(route = Screens.Seven.route){
            SevenScreen(navController)
        }
        composable(route = Screens.Eight.route){
            EightScreen(navController)
        }
        composable(route = Screens.Nine.route){
            NineScreen(navController)
        }
        composable(route = Screens.Ten.route){
            TenScreen(navController)
        }




    }
}