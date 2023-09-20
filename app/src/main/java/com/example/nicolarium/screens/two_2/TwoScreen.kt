package com.example.nicolarium.screens.two_2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nicolarium.navigation.Screens

//  НАЧАЛЬНЫЙ ЭКРАН (второй экран)

@Composable
fun TwoScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // для текстового поля TextField ниже
        var filledText by remember {     //добавить import androidx.compose.runtime.remember и  import androidx.compose.runtime.getValue
            mutableStateOf("")
        }
        TextField(                      // текстовое поле
            value = filledText,
            onValueChange = {filledText = it},
            //ниже textStyle....Right пользователь будет вводить текст с правой стороны
            textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Right),
          // label = { Text(text = "1ПОДСКАЗКА")}, // ПОДСКАЗКА ПРИ ПОСТАНОВКИ КУРСОРА СТАНОВИТЬСЯ МАЛЕНЬКОЙ
            placeholder = { Text(text = "2ПОДСКАЗКА")} ) // ПОДСКАЗКА ПРИ ВВОДЕ БУКВ ИСЧЕЗАЕТ



        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Text(
                text = "2 ЭКРАН",
                fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Button(
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.run { val buttonColors: ButtonColors =
                    buttonColors(Color.Black)
                    buttonColors
                },
                modifier = Modifier.padding(5.dp),
                onClick = {
                    //TODO: Navigate to Details
                    navController.navigate(Screens.Three.route)
                }
            ) {
                Text(
                    text = "переход на 3 экран",
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