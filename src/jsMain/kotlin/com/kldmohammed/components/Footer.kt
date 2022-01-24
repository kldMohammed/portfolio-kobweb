package com.kldmohammed.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.Link
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.text.Text
import com.varabyte.kobweb.silk.theme.colors.rememberColorMode
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Img
import com.varabyte.kobweb.silk.components.navigation.Link as SilkLink

@Composable
private fun OSSLabel() {
    Row(Modifier.margin(bottom = 32.px)) {
        FaGithub(Modifier.margin(right = 8.px))
        Text ("This site is ")
        SilkLink ("https://github.com/varabyte/kobweb-site", "open source")
    }
}

@Composable
private fun Logo() {
    Link(
        href = "/",
    ) {
        Box(Modifier.margin(4.px)) {
            Img(
                "images/logo.png",
                attrs = {
                    style {
                        height(18.px)
                    }
                }
            )
        }
    }
}

@Composable
fun Footer() {
    val colorMode by rememberColorMode()
    Box(
        Modifier.fillMaxWidth().minHeight(200.px).boxShadow(colorMode.toString()),
        contentAlignment = Alignment.Center
    ) {
        Column(
            Modifier.fillMaxWidth(70.percent).margin(1.em),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OSSLabel()
            Logo()
            Text(
                "Made with Kotlin Kobweb",
                Modifier.fontSize(0.75.em).opacity(70.percent).textAlign(TextAlign.Center)
            )
        }
    }
}