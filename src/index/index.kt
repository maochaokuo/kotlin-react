@file:Suppress("UnsafeCastFromDynamic")

package index

import app.*
import kotlinext.js.*
import kotlinx.html.style
import kotlinx.html.title
import react.RBuilder
import react.dom.*
import kotlin.browser.*
import bj.*

fun main(args: Array<String>) {
//    requireAll(require.context("src", true, js("/\\.css$/")))

    val rootDiv = document.getElementById("root")

    render(rootDiv ) {
        app()

//        child(App::class) {
//
//        }

//        gameUI()

//        div {
//            h1 { +"Blackjack" }
//            div{
//
//                attrs.title = "Foo"
//                attrs.style = js {
//                    display = "flex"
//                }
//
//                handUI("Player", 12)
//                handUI("Dealer", 14)
//
//            }
//        }

        //app()
    }
}


//                div{
//                    div { b { +"Dealer Hand" } }
//                    div { +"cards go here"  }
//                    div { b { +"14 Point" } }
//                }

//private fun RBuilder.handUi() {
//    div {
//        div { b { +"Player Hand" } }
//        div { +"cards go here" }
//        div { b { +"12 Point" } }
//    }
//}
