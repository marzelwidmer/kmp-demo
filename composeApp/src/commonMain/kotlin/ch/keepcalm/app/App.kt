package ch.keepcalm.app

import androidx.compose.runtime.Composable
import ch.keepcalm.app.theme.AppTheme

@Composable
internal fun App(
    systemAppearance: (isLight: Boolean) -> Unit = {}
) = AppTheme(systemAppearance) {

}
