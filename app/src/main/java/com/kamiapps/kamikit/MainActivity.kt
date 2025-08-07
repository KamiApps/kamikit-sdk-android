package com.kamiapps.kamikit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kamiapps.kamikit.core.colors.current
import com.kamiapps.kamikit.core.theme.KamiTheme
import com.kamiapps.kamikit.ui.theme.KamiKitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KamiKitTheme {
                // Demo içeriği
                Box(Modifier.fillMaxSize().background(Color.Red)) {

                }
            }

        }
    }
}


@Composable
@Preview
fun AppRoot() {
        Text(
            text = "Hello KamiKit",
            color = MaterialTheme.colorScheme.primary
        )
        Box(
            modifier = Modifier.background(KamiTheme.color.backgroundPrimary)
        )

}