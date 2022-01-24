package com.kldmohammed.components.widgets

import androidx.compose.runtime.Composable
import com.kldmohammed.pages.TitleStyle
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.Text
import org.jetbrains.compose.web.dom.P


@Composable
fun EducationWidget() {

    P {
        Column(TitleStyle.toModifier()) {
            Text("Emirate College for Science and Technology".uppercase())

            Text("BSc Computer Science", modifier = Modifier.color(Colors.DimGray))
        }
        Text("2011 - 2015", modifier = Modifier.color(Colors.Green))

    }


}