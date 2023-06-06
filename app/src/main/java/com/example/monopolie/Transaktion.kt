package com.example.monopolie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIconDefaults.Text
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

/*class Transaktion : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                var Betrag by remember{
                    mutableStateOf("")
                }
                Column(
                    modifier= Modifier
                        .fillMaxSize() //Kompleter Space wird genutzt
                        .background(Color.Yellow), //Hintergrund ist Gelb
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text= "Monopolie!", //Überschrift
                        fontSize = 80.sp
                    )
                    Button(onClick = {

                    }) {
                        Text(text = "Ueberweisen") // Button zum Starten ist vorbereitet

                    }
                    Button(onClick = {

                    }) {
                        Text(text = "Erhalten") // Button zum Starten ist vorbereitet

                    }
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ){
                        OutlinedTextField(value = Betrag, //Variable oben dekladiert
                            onValueChange = { text -> //Text ist gleich des geändert Wertes
                                Betrag = text
                            }
                        )
                    }
                }
            }
    }
}
*/