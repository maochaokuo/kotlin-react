@file:Suppress("UnsafeCastFromDynamic")

package bj

import kotlinext.js.*
import kotlinx.html.style
import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUI( ) {
    div{
        div { b { +"Dealer Hand" } }
        div { +"cards go here"  }
        div { b { +"14 Point" } }
    }
}

fun RBuilder.handUI(who: String, points: Int ) {
    div {
        attrs.style = js {
            width = "10rem"
            height = "10rem"
            padding ="1rem"
            marginTop = "1rem"
            marginRight = "1rem"
            background = "cyan"
        }
        div { b { +"$who Hand" } }
        div { +"cards goes here" }
        div { b { +"$points point" } }
    }
}
