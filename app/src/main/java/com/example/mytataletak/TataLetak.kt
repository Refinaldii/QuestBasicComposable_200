// File: TataletakLayouts.kt
package com.example.mytataletak

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text("Komponen1")
        Text("Komponen2")
        Text("Komponen3")
    }
}
@Composable
fun TataletakColumnRow(modifier: Modifier) {
    Column {
        Row {
            Text("Baris1-Komponen1")
            Text("Baris1-Komponen2")
        }
        Row {
            Text("Baris2-Komponen1")
            Text("Baris2-Komponen2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier) {
    Row {
        Column {
            Text("Kolom1-Komponen1")
            Text("Kolom1-Komponen2")
        }
        Column {
            Text("Kolom2-Komponen1")
            Text("Kolom2-Komponen2")
        }
    }
}



