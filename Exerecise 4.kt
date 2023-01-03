package com.example.twaiqandroid1

fun main() {
    var t = 35
    while (t > 10) {
        t -= 1
        when{
            (t == 30)  -> println("it's Hot")
            (t == 20) -> println("it's Comfy")
            (t == 15) -> println("IT'S COLD!!!")
            else -> println(t)
        }

    }
}