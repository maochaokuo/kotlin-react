package app

import bj.Game
import bj.gameUI
import react.*

// the original speaker forgot to provide Game class
//class Game {
//
//}

interface AppState : RState {
    var g: Game
}

class App : RComponent<RProps, AppState>() {

    override fun AppState.init() {
        g = Game( )
    }

    override fun RBuilder.render() {
        gameUI( state.g )

//        h1 { +"App" }

//        div("App-header") {
//            logo()
//            h2 {
//                +"Welcome to React with Kotlin"
//            }
//        }
//        p("App-intro") {
//            +"To get started, edit "
//            code { +"app/App.kt" }
//            +" and save to reload."
//        }
//        p("App-ticker") {
//            ticker()
//        }
    }
}

fun RBuilder.app() = child(App::class) {}
