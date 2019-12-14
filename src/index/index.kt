@file:Suppress("UnsafeCastFromDynamic")
package index

import app.*
import kotlinext.js.*
import kotlinx.html.style
import kotlinx.html.title
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        //app()
        div {
            h1 { +"Blackjack" }
            div{

                attrs.title = "Foo"
                attrs.style = js {
                    display = "flex"
                }

                div{
                    div { b { +"Player Hand" } }
                    div { +"cards go here"  }
                    div { b { +"12 Point" } }
                }

                div{
                    div { b { +"Dealer Hand" } }
                    div { +"cards go here"  }
                    div { b { +"14 Point" } }
                }

            }
        }
    }
}
