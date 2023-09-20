package com.example.nicolarium.screens.three_3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nicolarium.navigation.Screens

// 3 ЭКРАН  образец прокрутка с верхней фиксированной панелью

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThreeScreen(navController: NavController) {
    //
    Column {
        val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
        //enterAlwaysScrollBehavior() вместо pinnedScrollBehavior() если текст большой но не обязательно
Scaffold (
    modifier = Modifier
        .fillMaxSize()
        .nestedScroll(scrollBehavior.nestedScrollConnection),
    topBar = { TopAppBar(
        // CenterAlignedTopAppBar текст по центру
        // MediumTopAppBar текс ниже . если длинный текст
        // LargeTopAppBar текс ниже если очень большой
        title = {
            Text(text = "3 ЭКРАН" )
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription ="Go back"
                )
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = "Nikolay")
                
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Nikolay2")

            }


            IconButton(onClick = { //TODO: Navigate to Details
                navController.navigate(Screens.Fourth.route) }) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Nikolay3")
            }
        },
        scrollBehavior = scrollBehavior
    )
    }
) { values ->
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(values)
            .background(Color.White),
      //  verticalArrangement = Arrangement.Center,
       //  horizontalAlignment = Alignment.CenterHorizontally
    ){
        items(100){
            Text(text = "item$it", modifier = Modifier.padding(16.dp))
        }
    }
}}

}