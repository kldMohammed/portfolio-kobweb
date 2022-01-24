package com.kldmohammed.components.sections

import androidx.compose.runtime.Composable
import com.kldmohammed.components.widgets.EducationWidget
import com.kldmohammed.components.widgets.Section
import com.kldmohammed.pages.TitleStyle
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.Text

@Composable
fun EducationSection() {
    Section {
        Column(Modifier.fillMaxWidth()) {
            Text("Educations".uppercase(), modifier = TitleStyle.toModifier().color(Colors.Blue))
            Box(modifier = Modifier.align(Alignment.Center)) {
                EducationWidget()
            }
        }
    }
}