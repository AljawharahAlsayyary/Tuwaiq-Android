package com.example.twaiqandroid1

fun main(){

    var numbers = arrayListOf(10.2,11.5,17.4,12.3,19.7)
    var sum = 0.0

    for(num in numbers){
        sum += num
    }
    var average = sum / numbers.size

    println(average)

}
