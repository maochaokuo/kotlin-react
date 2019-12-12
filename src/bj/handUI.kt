package bj

import react.RBuilder
import react.dom.b
import react.dom.div


 fun RBuilder.hangUI() {
    div {
        div { b { +"Player Hand" } }
        div { +"cards goes here" }
        div { b { +"12 point" } }
    }
}
