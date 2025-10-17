// File: TataletakLayouts.kt
package com.example.mytataletak

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp)) {
        Row {
            Text("Baris1-Komponen1")
            Spacer(modifier = Modifier.width(8.dp))
            Text("Baris1-Komponen2")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            Text("Baris2-Komponen1")
            Spacer(modifier = Modifier.width(8.dp))
            Text("Baris2-Komponen2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(modifier = modifier.padding(8.dp)) {
        Column {
            Text("Kolom1-Komponen1")
            Text("Kolom1-Komponen2")
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text("Kolom2-Komponen1")
            Text("Kolom2-Komponen2")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    val gambar = painterResource(id = R.drawable.ic_launcher_background)
    Column(modifier = modifier.padding(8.dp)) {
        Box(
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
                .background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Text("Header Box")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = gambar, contentDescription = null)
            Text("My Image")
        }
    }
}
