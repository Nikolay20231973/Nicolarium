package com.example.nicolarium

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.nicolarium.navigation.NavGraph
import com.example.nicolarium.ui.theme.NicolariumTheme

/**  Gradle Module:
1    implementation( "androidx.navigation:navigation-compose:2.4.2")
2    implementation("androidx.compose.material3:material3:1.1.1")    добавить :1.1.1
3    implementation("androidx.compose.material:material-icons-extended:1.4.3") необязательно расширенный набор значков
4  composeOptions {
        kotlinCompilerExtensionVersion = "1.4.5"     проверить версия 1.4.5
    }
5   Gradle Project:
         plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library")version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false }
*/
/*       Экраны:
one    1 ЭКРАН   Образец разных кнопок.
two    2 ЭКРАН   Ввод текста для пользователя TextField.
thee   3 ЭКРАН   Образец прокрутка с верхней фиксированной панелью.
fourth 4 ЭКРАН   Нижняя панель только для мобильных устройств, не для больших экранов, и не использовать паненль для перехода на другую страницу.
five   5 ЭКРАН   Нижняя панель для навигации перемещаться по разным экранам.
six    6 ЭКРАН   Прокрутка вниз картинки с текстом и кнопкой перехода на другую страницу.
seven  7 ЭКРАН   ИГРА В СЛОВА
*/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NicolariumTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavGraph(navController = navController)
                }
            }
        }
    }
}