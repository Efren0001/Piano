package com.example.piano

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.piano.ui.theme.PianoTheme
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.clickable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PianoTheme {
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
fun MiPiano() {
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .weight(1f)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.a5)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    },
                contentAlignment = Alignment.CenterStart
            ) {
                Text("DO", modifier = Modifier.rotate(90F), color = Color.Black)
            }
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.Gray)
                    .weight(1f)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.b5)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    },
                contentAlignment = Alignment.CenterStart
            ) {
                Text("RE", modifier = Modifier.rotate(90F), color = Color.Black)
            }
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .weight(1f)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.c5)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    },
                contentAlignment = Alignment.CenterStart
            ) {
                Text("MI", modifier = Modifier.rotate(90F), color = Color.Black)
            }
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.Gray)
                    .weight(1f)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.d5)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    },
                contentAlignment = Alignment.CenterStart
            ) {
                Text("FA", modifier = Modifier.rotate(90F), color = Color.Black)
            }
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .weight(1f)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.e5)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    },
                contentAlignment = Alignment.CenterStart
            ) {
                Text("SOL", modifier = Modifier.rotate(90F), color = Color.Black)
            }
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.Gray)
                    .weight(1f)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.f5)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    },
                contentAlignment = Alignment.CenterStart
            ) {
                Text("LA", modifier = Modifier.rotate(90F), color = Color.Black)
            }

            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .weight(1f)
                    .clickable {
                        val mediaPlayer = MediaPlayer.create(context, R.raw.g5)
                        mediaPlayer.start()
                        mediaPlayer.setOnCompletionListener {
                            mediaPlayer.release()
                        }
                    },
                contentAlignment = Alignment.CenterStart
            ) {
                Text("SI", modifier = Modifier.rotate(90F), color = Color.Black)
            }
        }


        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.piano),  // Imagen del piano
                contentDescription = "Imagen del piano",
                modifier = Modifier
                    .fillMaxHeight()
                    .width(300.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    MiPiano()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PianoTheme {
        Greeting("Android")
    }
}