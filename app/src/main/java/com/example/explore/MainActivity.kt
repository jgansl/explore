package com.example.explore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.explore.ui.theme.ExploreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExploreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    var counter by remember { mutableStateOf(0)}
    Surface(color = Color.Red) {
    Column {
        Button(modifier = Modifier.padding(16.dp), onClick = { counter++}) {
            Text(stringResource(id = R.string.increment_counter))
        }
        Text(text = stringResource(id = R.string.clicks, counter))
    }
    }
}

@Preview(fontScale = 1.5f)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExploreTheme {
        Greeting()
    }
}