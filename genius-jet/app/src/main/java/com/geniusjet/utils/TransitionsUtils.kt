package com.geniusjet.utils

//import android.util.Log
//import androidx.animation.FloatPropKey
//import androidx.animation.Infinite
//import androidx.animation.LinearEasing
//import androidx.animation.transitionDefinition
//import androidx.compose.Composable
//import androidx.ui.animation.Transition
//
//val rotation = FloatPropKey()
//
//val definition = transitionDefinition {
//    state(0) {
//        this[rotation] = 0f
//    }
//
//    state(1) {
//        this[rotation] = 360f
//    }
//
//    transition {
//        rotation using repeatable {
//            animation = tween {
//                easing = LinearEasing
//                duration = 100000
//            }
//            iterations = Infinite
//        }
//    }
//}
//
//@Composable
//fun TransitionTest() {
//    Transition(definition = definition, initState = 0, toState = 1) {
//        val currentFloatValue = it[rotation]
//        Log.d("Transition", currentFloatValue.toString())
//    }
//}