package com.kamiapps.kamikit.core.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
private fun LightPreview() {
    KamikitTheme(darkTheme = false) {
        Box(Modifier.size(120.dp)) {
            Text("Kamikit", color = MaterialTheme.colorScheme.primary)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DarkPreview() {
    KamikitTheme(darkTheme = true) {
        Box(Modifier.size(120.dp)) {
            Text("Kamikit", color = MaterialTheme.colorScheme.primary)
        }
    }
}

