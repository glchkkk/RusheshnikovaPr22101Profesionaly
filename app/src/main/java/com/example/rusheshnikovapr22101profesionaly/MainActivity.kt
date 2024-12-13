package com.example.rusheshnikovapr22101profesionaly

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppScreen()
        }
    }
}

@Composable
fun AppScreen() {
    val navController = rememberNavController()
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF2196F3))) { // Синий фон для всего приложения
        NavHost(navController = navController, startDestination = "welcome") {
            composable("welcome") { WelcomeScreen(navController) }
            composable("matule") { MatuleScreen(navController) }
            composable("start") { StartScreen(navController) }
            composable("power") { PowerScreen(navController) }
        }
    }
}

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "ДОБРО ПОЖАЛОВАТЬ", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("matule") }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
            Text("начать")
        }
    }
}

@Composable
fun MatuleScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "MALUTE me", fontSize = 48.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("start") }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
            Text("Далее")
        }
    }
}


@Composable
fun StartScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Начнем путешествие", fontSize = 36.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Умная, великолепная и модная коллекция. изучите сейчас",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("power") }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
            Text("Далее")
        }
    }
}

@Composable
fun PowerScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "У Вас есть сила, чтобы", fontSize = 36.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "В Вашей комнате много красивых и привлекательных растений",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {  }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
            Text("Далее")
        }
    }
}