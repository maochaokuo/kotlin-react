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

fun RBuilder.buttonBar( ) {
    div {
        button {
            +"Deal"
            attrs.onClickFunction = {
                console.log("d")
            }
        }
        button {
            +"Hit"
            attrs.onClickFunction = {
                console.log("h")
            }
        }
        button {
            +"Stay"
            attrs.onClickFunction = {
                console.log("s")
            }
        }
    }
}
