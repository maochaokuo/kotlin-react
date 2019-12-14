package index

import app.*
import kotlinext.js.*
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    requireAll(require.context("src", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        //app()

        h1{
            +"Blackjack"
            div{

                div{
                    div { b { +"Player Hand" } }
                    div { +"cards go here"  }
                    div { b { +"12 Point" } }
                }

            }
        }
    }
}
