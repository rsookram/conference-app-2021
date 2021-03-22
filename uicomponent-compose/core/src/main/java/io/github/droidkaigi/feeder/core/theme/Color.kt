package io.github.droidkaigi.feeder.core.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val blue200 = Color(0xFF00B5E2)
val blue700 = Color(0xFF00639D)
val green200 = Color(0xFF48D597)
val greenDroid = Color(0xFF3DDC84)

val blue300 = Color(0xFF0095C4)
val gray = Color(0xFF232323)

internal val LocalFilterMuskColor = staticCompositionLocalOf<Color> {
    error("No Musk Color Provided")
}
