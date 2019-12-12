package index

import kotlinx.html.style
import kotlinx.html.title
import react.RBuilder
import react.dom.*
import kotlin.browser.*
import kotlin.js.*
import kotlin.js.js as js1
import bj.*

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("root")

    render(rootDiv) {
        gameUI()
    }
    /*
                attrs.style = js1 {
                    display = "flex"
                }
     */
}
