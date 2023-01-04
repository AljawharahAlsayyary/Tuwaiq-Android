package com.example.twaiqandroid1

fun main() {

    println( operators(string = "+")) // when you write here any argument it will calculate it

}
fun operators (double1: Double = 11.5 , double2: Double = 13.5 , string: String = "+") {


    for (s in string) {
        when (string) {
            "+" -> println (double1 + double2)
            "-" -> println (double1 - double2)
            "*" -> println (double1 * double2)
            "/" -> println (double1 / double2)
            else -> println("not the correct argument")
        }
    }

}







