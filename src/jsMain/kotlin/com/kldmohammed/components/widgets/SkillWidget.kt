package com.kldmohammed.components.widgets

import androidx.compose.runtime.Composable
import com.kldmohammed.data.Skill
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrModifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.text.Text
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Progress

val CustomStyle = ComponentStyle("progress") {
    base {
        Modifier.attrModifier {

        }
    }
}

@Composable
fun SkillWidget(skill: Skill) {

    Row {
        Text(skill.title , modifier = Modifier.padding(right = 10.px))

        Progress (attrs = {
            attr("value", skill.score)
            attr("max", 100.toString())
            attr("accent-color", "red")
        })
        Spacer()
    }
}