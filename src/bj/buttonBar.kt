@file:Suppress("UnsafeCastFromDynamic")

package bj

import kotlinext.js.js
import kotlinx.html.js.onClickFunction
import kotlinx.html.style
import kotlinx.html.title
import react.RBuilder
import react.dom.b
import react.dom.button
import react.dom.div
import react.dom.h1
import kotlin.js.js as js1

interface Eh {
    fun deal() {}
    fun hit() {}
    fun stay() {}
}

fun RBuilder.buttonBar( eh: Eh) {
    div {
        button {
            +"Deal"
            attrs.onClickFunction = {
                console.log("d")
                eh.deal()
            }
        }
        button {
            +"Hit"
            attrs.onClickFunction = {
                console.log("h")
                eh.hit()
            }
        }
        button {
            +"Stay"
            attrs.onClickFunction = {
                console.log("s")
                eh.stay()
            }
        }
    }
}
