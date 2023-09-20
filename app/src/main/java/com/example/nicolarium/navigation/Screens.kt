package com.example.nicolarium.navigation

sealed class Screens(val route: String) {
    object One: Screens("one_screen")
    object Two: Screens("two_screen")
    object Three: Screens("three_screen")
    object Fourth: Screens("fourth_screen")
    object Five: Screens("five_screen")
    object Six: Screens("six_screen")
    object Seven: Screens("seven_screen")
    object Eight: Screens("eight_screen")
    object Nine: Screens("nine_screen")
    object Ten: Screens("ten_screen")
}
