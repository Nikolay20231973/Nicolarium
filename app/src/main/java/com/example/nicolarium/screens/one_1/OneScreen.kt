package com.example.nicolarium.screens.one_1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nicolarium.navigation.Screens

// ОБРАЗЦЫ КНОПОК (1экран)

@Composable
fun OneScreen(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "1 ЭКРАН",
                fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                fontWeight = FontWeight.Bold
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "ОБРАЗЦЫ КНОПОК",
                fontSize = MaterialTheme.typography.headlineLarge.fontSize,
                fontWeight = FontWeight.Bold
            )

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.Green),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {  //TODO: Navigate to Home Screen
                navController.navigate(Screens.Six.route) }) {
                Text(text = " Button НА 6 ЭКРАН")
            }

            OutlinedButton(onClick = {  //TODO: Navigate to Home Screen
                navController.navigate(Screens.Five.route) }) {
                Text(text = "OutlinedButton НА 5 ЭКРАН")
            }

            FilledTonalButton(onClick = {  //TODO: Navigate to Home Screen
                navController.navigate(Screens.Fourth.route) }) {
                Text(text = "FilledTonalButton НА 4 ЭКРАН")
            }

            TextButton(onClick = {   //TODO: Navigate to Home Screen
                navController.navigate(Screens.Three.route)}) {
                Text(text = "TextButton НА 3 ЭКРАН")   // КНОПКА БЕЗ РАМКИ
            }

            ElevatedButton(          // кнопка с тенью
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.run { val buttonColors =
                    buttonColors(Color.Black)
                    buttonColors
                },
                modifier = Modifier.padding(5.dp),
                onClick = {
                    //TODO: Navigate to Home Screen
                    navController.navigate(Screens.Two.route)
                }
            ) {
                Icon(
                    imageVector = Icons.Outlined.Add ,
                    contentDescription = "j",
                    modifier = Modifier.size(18.dp)   // меняем размер потому что это не используется для значков по умолчанию
                )
                
                Spacer(modifier = Modifier.width(8.dp)) // пустота между

                Text(
                    text = "ElevatedButton на 2 экран",
                    modifier = Modifier.padding(5.dp),
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    ))
            }
        }
    }
}
