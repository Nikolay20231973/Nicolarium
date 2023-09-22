package com.example.nicolarium.screens.seven_7

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nicolarium.navigation.Screens
import com.example.nicolarium.screens.seven_7.u.GameScreen

// 7 ЭКРАН  ИГРА СЛОВА И В НИЗУ КНОПКА ПЕРЕХОДА НА ДРУГОЙ ЭКРАН
//

@Composable
fun SevenScreen(navController: NavController) {
Column (modifier = Modifier
    .fillMaxSize()
    .background(Color.Yellow),
    verticalArrangement = Arrangement.SpaceBetween,
    horizontalAlignment = Alignment.CenterHorizontally){
// ниже код игра слова
    Column (modifier = Modifier
        .fillMaxWidth().fillMaxHeight(0.9f)
    .background(Color.White),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        GameScreen(navController)
    }                         // выше код игра слов

    // ниже код: текст 7 экран кнопка переход на 8 экран
    /**Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "7 ЭКРАН",
                fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
*/
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.run {
                    val buttonColors: ButtonColors =
                        buttonColors(Color.Black)
                    buttonColors
                },
                modifier = Modifier.padding(1.dp),
                onClick = {
                    //TODO: Navigate to Details
                    navController.navigate(Screens.Eight.route)
                }
            ) {
                Text(
                    text = "переход на 8 экран",
                    modifier = Modifier.padding(5.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
            }
        }
    }
}
//}