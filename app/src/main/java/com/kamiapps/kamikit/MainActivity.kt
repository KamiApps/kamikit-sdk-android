package com.kamiapps.kamikit

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kamiapps.kamikit.core.theme.KamiTheme
import com.kamiapps.kamikit.ui.theme.KamiKitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KamiKitTheme(darkTheme = true) {
                KamiTheme(darkTheme = true) {
                    AppRootContent()
                }
            }
        }
    }
}


@Composable
private fun AppRootContent() {
    Text(text = "Hello KamiKit")
    Box(
        modifier = Modifier
            .size(40.dp)
            .background(KamiTheme.color.backgroundPrimary) // tema rengi
    )
}

@Preview(
    name = "Dark",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    backgroundColor = 0xFF000000
)
@Composable
fun AppRootDarkPreview() {
    // Eğer KamiKitTheme içinde KamiTheme çağrısı yoksa iki kat sarmala:
    KamiKitTheme(darkTheme = true) {
        KamiTheme(darkTheme = true) {
            AppRootContent()
        }
    }
}

@Preview(
    name = "Light",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
fun AppRootLightPreview() {
    KamiKitTheme(darkTheme = false) {
        KamiTheme(darkTheme = false) {
            AppRootContent()
        }
    }
}
