package com.kldmohammed.pages

import androidx.compose.runtime.Composable
import com.kldmohammed.components.layouts.PageLayout
import com.kldmohammed.components.sections.EducationSection
import com.kldmohammed.components.sections.ExperienceSection
import com.kldmohammed.components.sections.IntroSecion
import com.kldmohammed.components.sections.SkillSection
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Page
@Composable
fun HomePage() {
    PageLayout("Khalid Mohammed") {
        Box(
            Modifier.width(100.percent).padding(30.px),
            contentAlignment = Alignment.Center,
        ) {
            IntroSecion()
            ExperienceSection()
            SkillSection()
            EducationSection()
        }


    }
}