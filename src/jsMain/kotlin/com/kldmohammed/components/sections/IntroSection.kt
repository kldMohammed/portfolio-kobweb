package com.kldmohammed.components.sections

import androidx.compose.runtime.Composable
import com.kldmohammed.components.widgets.IntroWidget
import com.kldmohammed.components.widgets.Section
import com.varabyte.kobweb.compose.ui.Modifier

@Composable
fun IntroSecion() {
    Section {
        IntroWidget(Modifier)
    }
}