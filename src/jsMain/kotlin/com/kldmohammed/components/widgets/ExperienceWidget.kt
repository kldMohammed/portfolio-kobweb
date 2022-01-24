package com.kldmohammed.components.widgets

import androidx.compose.runtime.Composable
import com.kldmohammed.data.Experience
import com.kldmohammed.pages.TitleStyle
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.Text
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Ul


@Composable
fun ExperienceWidget(experience: Experience) {

    P {
        Column(TitleStyle.toModifier()) {
            Text(experience.jobTitle.uppercase())

            Text(experience.companyName.uppercase(), modifier = Modifier.color(Colors.DimGray))
        }
        Text(experience.formatDate(), modifier = Modifier.color(Colors.Green))
        Br()
        if (experience.descriptions.isNotEmpty()) {
            Ul {
                experience.descriptions.forEach { desc ->
                    Li {
                        Text(desc, modifier = Modifier.color(Colors.DarkGray))
                    }
                }
            }
        }

        if (experience.achievements.isNotEmpty()) {
            Text("Achievements".uppercase(), modifier = Modifier.color(Colors.DarkGreen))
            Ul {
                experience.achievements.forEach { achievement ->
                    Li {
                        Text(achievement, modifier = Modifier.color(Colors.DarkGray))
                    }
                }
            }
        }

    }


}