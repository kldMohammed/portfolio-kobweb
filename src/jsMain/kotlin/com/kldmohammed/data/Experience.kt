package com.kldmohammed.data

data class Experience(
    val jobTitle: String,
    val companyName: String,
    val jobDescription: String,

    val startDate: String,
    val endDate: String,
    val isStillWorkingThere: Boolean = false,
    val descriptions: List<String>,
    val achievements: List<String>,
) {
    fun formatDate(): String {
        if (isStillWorkingThere) {
            return "$startDate - Present"
        }

        return "$startDate - $endDate"
    }
}


val experiences = listOf<Experience>(
    Experience(
        "Senior Android Engineer",
        "Interface Co ltd",
        "Working on existing code bases and developing a new app in health field, and multible field.",
        startDate = "April 2020", endDate = "November 2020", isStillWorkingThere = true,
        descriptions = listOf(
            "Managing team of 5 people and tasks.",
            "Implemented features for more than 4 applications in Java, Kotlin.",
            "Determined architectural and product design details for open-ended tasks or specifications.",
            "Collaborated with quality engineers, user research, product management, design, and support teams to ensure quality in all phases of app development.",
            "Worked closely with core technology teams and other platform teams to balance cross-platform consistency with Android optimization.",
            "Conducted workload assessments and direct the new developer to use a suitable architecture that led to decreased debugging and maintainability time by 40%.",
            "Wrote elegant, self-documenting code, easy to read and adapt for other developers.",
            "Reviewed design specs and engineering docs and provide feedback.",
        ),
        achievements = listOf(
            "Working on and testing 2 Android apps in health, and eCommerce.",
            "Integrated third-party libraries including retrofit, room, firebase , kodein and coil.that led to boost performance.",

            )
    ),

    Experience(
        "Senior Android Engineer",
        "ENAYA TECHNOLOGY",
        "Working on existing code bases and developing a new app in payment and health field, and developing new apps",
        startDate = "March 2020", endDate = "June 2021",
        descriptions = listOf(
            "Implemented features for various applications in Kotlin.",
            "Determined architectural and product design details for open-ended tasks or specifications.",
            "Collaborated with quality engineers, user research, product management, design, and support teams to ensure quality in all phases of app development.",
            "Worked closely with core technology teams and other platform teams to balance cross-platform consistency with Android optimization.",
            "Wrote elegant, self-documenting code, easy to read and adapt for other developers.",
            "Reviewed design specs and engineering docs and provide feedback.",
        ),
        achievements = listOf(
            "Created and tested 3 Android apps in payment, health, and booking.",
            "Integrated third-party libraries including retrofit, room, firebase and coil.",
            "Implemented Clean Architecture using Dagger Hilt and kotlin coroutine.",
        ),
    ),
    Experience(
        "Senior Android Engineer",
        "Full Screen Co Ltd",
        "Working on existing code bases and developing a new app in health field, and multible field.",
        startDate = "April 2020", endDate = "November 2020",
        descriptions = listOf(
            "Working on an existing codebase for health and e-commerce apps.",
            "Implemented features for various applications in Java, Kotlin.",
            "Applied expert knowledge of Android system frameworks to solve novel problems.",
            "Worked with webrtc to implement a video and voice chat.",
        ),
        achievements = listOf(
            "Worked and tested 2 Android apps in health, and e-commerce.",
            "Learning about contus mirrorFly SDK for webrtc.",
        ),
    ),

    Experience(
        "Senior Android Engineer",
        "Masdar group Co. ltd",
        "Working on existing code bases and developing a new app in health field, and multible field.",
        startDate = "September 2019", endDate = "February 2020",
        descriptions = listOf(
            "Working on an existing codebase for transportation apps.",
            "Implemented features for various applications in  Kotlin.",
            "Applied expert knowledge of Android system frameworks to solve novel problems.",
            "Worked with webrtc to implement a chat using XMPP.",
        ),
        achievements = listOf(
            "Worked and tested 2 Android apps in transportation.",
            "Worked with socket and location.",
        ),
    ),
    Experience(
        "Senior Android Engineer",
        "Baylasan Innovation",
        "Working on existing code bases and developing a new app in health field, and multible field.",
        startDate = "October 2019", endDate = "January 2020",
        descriptions = listOf(
            "Developing apps that help communities grow in multiple fields: agricultural, industrial.",
            "Implemented features for various applications in  Kotlin.",
            "Collaborated with quality engineers, user research, product management, design, and support teams to ensure quality in all phases of app development.",
            "Wrote a clean code following uncle bob guide.",
        ),
        achievements = listOf(
            "Creating an android application to provide information about companies and startups in Sudan.",
            "Worked with RxJava/RxKotlin and location.",
        ),
    ),
    Experience(
        "Senior Android Engineer",
        "Alhayek Golden Group",
        "Working on existing code bases and developing a new app in health field, and multible field.",
        startDate = "June 2019", endDate = "September 2020",
        descriptions = listOf(
            "Working on an existing codebase for ticketing and e-commerce apps.",
            "Implemented features for various applications in  Kotlin.",
            "Collaborated with quality engineers, user research, product management, design, and support teams to ensure quality in all phases of app development.",
            "Gathering client requirements.",
        ),
        achievements = listOf(
            "Creating an Android application for an organization online store application.",
            "Implementing a new feature on ticketing applications.",
        ),
    ),

    Experience(
        "Senior Android Engineer",
        "Service Zone co ltd",
        "Working on existing code bases and developing a new app in health field, and multible field.",
        startDate = "November 2018", endDate = "April 2019",
        descriptions = listOf(
            "Creating an android application for home services.",
            "Analyzed some ideas with stakeholders and convince them if it is applicable in the Sudan market.",
            "Implemented features for various applications in  Kotlin.",
            "Deployed beta version android app, which helped to identify bugs, user experience issues, and functionality problems.",
            "Gathering client requirements.",
        ),
        achievements = listOf(
            "Creating an android application for ordering  Home services.",
            "Analyzing services and application flow.",
            "Implementing a polished design.",
        ),
    ),
    Experience(
        "Senior Android Engineer",
        "Susham Galaxy co ltd",
        "Working on existing code bases and developing a new app in health field, and multiple field.",
        startDate = "January 2018", endDate = "October 2018",
        descriptions = listOf(
            "Creating an android application for medical services.",
            "Conceptualize, develop, and test native Android applications using Kotlin programming language, including UI, core functionality, and third-party SDKs.",
            "Deployed beta version android app, which helped to identify bugs, user experience issues, and functionality problems.",
            "Coding app using Kotlin language.",
        ),
        achievements = listOf(
            "Creating an android application for requesting an ambulance.",
            "Analyzing services and application flow.",
        ),
    ),
    Experience(
        "Senior Android Engineer",
        "Susham Galaxy co ltd",
        "Working on existing code bases and developing a new app in health field, and multiple field.",
        startDate = "January 2018", endDate = "October 2018",
        descriptions = listOf(
            "Creating an android application for medical services.",
            "Conceptualize, develop, and test native Android applications using Kotlin programming language, including UI, core functionality, and third-party SDKs.",
            "Deployed beta version android app, which helped to identify bugs, user experience issues, and functionality problems.",
            "Coding app using Kotlin language.",
        ),
        achievements = listOf(
            "Creating an android application for requesting an ambulance.",
            "Analyzing services and application flow.",
        ),
    ),

    Experience(
        "Android Engineer",
        "MBS Solutions",
        "Working on existing code bases and developing a new app in health field, and multiple field.",
        startDate = "November 2017", endDate = "December 2017",
        descriptions = listOf(
            "Creating an android application for ordering home services.",
            "Conceptualize, develop, and test native Android applications using Java programming language, including UI, core functionality, and third-party SDKs.",
            "Deployed beta version android app, which helped to identify bugs, user experience issues, and functionality problems.",
            "Helping teammates working on other projects.",
            "I worked in the company for the duration of the project development.",
        ),
        achievements = listOf(
            "Creating an android application for requesting home workers.",
            "Analyzing services and application flow.",
        ),
    ),

    Experience(
        "Teaching assistant",
        "Emirate college for science and technology",
        "Working on existing code bases and developing a new app in health field, and multiple field.",
        startDate = "April 2016", endDate = "September 2017",
        descriptions = listOf(
            "Teaching students in labs.",
            "Teaching them languages like java, c++, data structures and vb.net using visual studio 2012.",
        ),
        achievements = listOf(
            "Practising what I learned in college.",
            "Get more understanding about programming concepts.",
        ),
    ),
    Experience(
        "Android Engineer",
        "MBS Solutions",
        "Working on existing code bases and developing a new app in health field, and multiple field.",
        startDate = "November 2015", endDate = "April 2016",
        descriptions = listOf(
            "Creating a desktop application for Beauty centres.",
            "Using a VB .Net to build a desktop application.",
            "Conceptualize, develop, and test native Android applications using Java programming language, including UI, core functionality, and third-party SDKs.",
            "Deployed beta version android app, which helped to identify bugs, user experience issues, and functionality problems.",
            "Helping teammates working on other projects.",
            "I worked in the company for the duration of the project development.",
        ),
        achievements = listOf(
            "Creating a desktop application for  Beauty centres.",
            "Using a VB .Net to build a desktop application.",
        ),
    ),
)