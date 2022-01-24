package com.kldmohammed.components.widgets

import androidx.compose.runtime.Composable
import com.kldmohammed.pages.TitleStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.asAttributeBuilder
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaFacebookSquare
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.FaTwitter
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.Text
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P


private val DARK_BACKGROUND = Color.rgb(25, 25, 25)
private val LIGHT_BACKGROUND = DARK_BACKGROUND.inverted()

@Composable
fun IntroWidget(modifier: Modifier) {
    Column(
        modifier.padding(12.px).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // We have to slightly tweak header settings here from the actual code sample above since
        // the overall site overloads H1 values from the default

        H1(attrs = Modifier.fontWeight(FontWeight.Bold).margin(bottom = 0.cssRem).asAttributeBuilder()) {
            Text("Khalid Mohammed")

        }
        Text("Senior Android Engineer".uppercase(), modifier = TitleStyle.toModifier().color(Colors.DimGray))
//        H4 { Text("Senior Android Engineer") }
        P(attrs = Modifier.align(Alignment.CenterHorizontally).margin(bottom = 1.cssRem, left = 2.cssRem, right = 2.cssRem).asAttributeBuilder()) {
            Text(
                "A curiosity-driven Android developer with 5+ years of experience writing top-quality clean code for high-paced businesses. Eager to deliver an incredible user experience. writing code for a living and fun. Love beautiful apps with clean code.\n" +
                        "Friendly, curious and with a concise list of interests.\n"
            )
        }
        Column {
            Row {
                LinkButton("https://github.com/kldMohammed", BUTTON_MARGIN, shape = ButtonShape.CIRCLE) {
                    FaGithub()
                }
                LinkButton("https://www.facebook.com/kldmohammed.5", BUTTON_MARGIN, shape = ButtonShape.CIRCLE) {
                    FaFacebookSquare()
                }
                LinkButton("https://www.linkedin.com/in/kldmohammed/", BUTTON_MARGIN, shape = ButtonShape.CIRCLE) {
                    FaLinkedin()
                }
                LinkButton("https://twitter.com/kldMohammed_5", BUTTON_MARGIN, shape = ButtonShape.CIRCLE) {
                    FaTwitter()
                }

//                Img(src = "https://cdn.jsdelivr.net/gh/devicons/devicon/icons/adonisjs/adonisjs-original.svg")
            }
        }
    }
}