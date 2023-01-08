package com.example.twaiqandroid1

import kotlin.random.Random

fun main(){

    var numbers = arrayListOf<Double>()

    var counter = 1.0
    for (i in 1..5) numbers.add(++counter)

    // solution 1:
    var average = 0.0
    for (i in numbers ) average += i
    println(average / numbers.size)

    // solution 2:
    println(numbers.average())


    /* var numbers = arrayListOf(10.2,11.5,17.4,12.3,19.7)
     var sum = 0.0

     for(num in numbers){
         sum += num
     }
     var average = sum / numbers.size

     println(average) */

}
