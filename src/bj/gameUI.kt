@file:Suppress("UnsafeCastFromDynamic")

package bj

import kotlinext.js.js
import kotlinx.html.style
import kotlinx.html.title
import react.RBuilder
import react.dom.b
import react.dom.div
import react.dom.h1
import kotlin.js.js as js1

fun RBuilder.gameUI(g: Game, eh: Eh ) {
    div {
        h1 { +"Blackjack" }
        buttonBar(eh)
        div {

            attrs.title = "Foo"
            attrs.style = js {
                display = "flex"
            }

            handUI("Player", 12)
            handUI("Dealer", 14)
//            handUI()
//            handUI()

        }
    }
}
/*
            attrs.title = "Foo"

            attrs.style = kotlin.js.js {
                display = "flex"
            }
 */