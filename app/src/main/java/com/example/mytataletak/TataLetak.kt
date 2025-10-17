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
