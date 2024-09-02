package com.example.ejemplolab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemplolab04.ui.theme.Ejemplolab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplolab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ejemplolab04Theme {
        Greeting("Android")
    }
}

##################################Cambios####################################
fun ViewHolaCurso() {
   Column(
       modifier = Modifier
           .fillMaxWith()
           .padding(16.dp),
       horizontalAlignment = Alignment.CenterHorizontally
   ) {
       Text(
           text = "Welcome to the Course!",
           fontSize = 28.sp,
           fontWeight = FontWeigh.Bold
       )
       Spacer(modifier = Modifier.heigh(16.dp))
       Text(
           text = "Hello, Student!",
           fontSize = 20.xD
      
   }
}