# KamiKit (Android) — Colors

[![KamiKit](https://jitpack.io/v/KamiApps/kamikit-sdk-android.svg)](https://jitpack.io/#KamiApps/kamikit-sdk-android)

![Build status](https://github.com/KamiApps/kamikit-sdk-android/actions/workflows/build.yml/badge.svg)

[![JitPack](https://jitpack.io/v/KamiApps/kamikit-sdk-android.svg)](https://jitpack.io/#KamiApps/kamikit-sdk-android)

[![Kotlin Version](https://kotlin-version.aws.icerock.dev/kotlin-version?group=com.kamiapps.kamikit&name=kamikit-sdk-android)](https://kotlinlang.org)

![License](https://img.shields.io/badge/license-MIT-blue.svg)

**KamiKit Colors**, iOS-semantiğine benzer şekilde tasarlanmış, **light/dark** varyantları olan **semantik renk sistemi** sunar.
Şimdilik yalnızca **renk altyapısı** yayınlanmıştır; bileşenler ve diğer paketler sonraki sürümlerde eklenecek.

---

## ⚙️ Kurulum

**1) JitPack deposunu ekle**

**Gradle (settings.gradle / dependencyResolutionManagement)**

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
    // diğer repository'ler…
}
```

**Groovy (settings.gradle / dependencyResolutionManagement)**

```groovy
repositories {
    maven { url 'https://jitpack.io' }
    // diğer repository'ler…
}
```

**2) Bağımlılık ekle**

> JitPack, projedeki `maven-publish` ayarlarını kullanır. Bu repo için koordinatlar: 
> 
> `com.github.KamiApps:kamikit-sdk-android:<Tag>`

**Kotlin DSL**

```kotlin
dependencies {
    implementation("com.github.KamiApps:kamikit-sdk-android:0.1.0-colors")
}
```

**Groovy**

```groovy
dependencies {
    implementation 'com.github.KamiApps:kamikit-sdk-android:0.1.0-colors'
}
```

---

## 🚀 Basit Kullanım

**Uygulama kökünde temayı uygula ve renklere eriş:**

```kotlin
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kamiapps.kamikit.core.theme.KamiTheme

@Composable
fun Sample() {
    KamiTheme { // sistem light/dark'a göre otomatik seçer
        Box(
            Modifier
                .size(80.dp)
                .background(KamiTheme.color.backgroundPrimary)
        )
        Text(
            text = "Hello KamiKit",
            color = KamiTheme.color.textPrimary
        )
    }
}
```

**Dark/Light’ı elle zorlamak istersen:**

```kotlin
@Composable
fun ForcedDarkSample() {
    KamiTheme(darkTheme = true) { // her zaman dark
        Text(
            "Dark text",
            color = KamiTheme.color.textPrimary
        )
    }
}
```




