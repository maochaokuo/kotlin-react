@file:Suppress("UnsafeCastFromDynamic")

package bj

import kotlinx.html.title
import react.RBuilder
import react.dom.b
import react.dom.div
import react.dom.h1
import kotlin.js.js as js1

fun RBuilder.gameUI() {
    div {
        h1 { +"Blackjack" }
        div {

            hangUI()
            hangUI()

        }
    }
}
/*
            attrs.title = "Foo"

            attrs.style = kotlin.js.js {
                display = "flex"
            }
 */