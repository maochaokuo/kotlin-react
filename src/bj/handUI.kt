@file:Suppress("UnsafeCastFromDynamic")

package bj

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
        div { b { +"$who Hand" } }
        div { +"cards goes here" }
        div { b { +"$points point" } }
    }
}
