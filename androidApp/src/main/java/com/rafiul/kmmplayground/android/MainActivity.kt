package com.rafiul.kmmplayground.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rafiul.kmmplayground.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AlignedTexts(Greeting().greet(), Greeting().nameShow())
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String, name: String) {
    Text(text = text)
    Text(text = name)
}

@Composable
fun AlignedTexts(text: String, name: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        Text(text = text)
        Text(text = name)
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        AlignedTexts("Hello, Android!", "Name Here")
    }
}
