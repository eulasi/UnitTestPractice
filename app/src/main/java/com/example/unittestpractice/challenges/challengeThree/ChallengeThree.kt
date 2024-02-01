package com.example.unittestpractice.challenges.challengeThree
// Function to check if the digit 7 is present in the given number
class NumberOfDigitsInAnInteger {

    fun isSeven(number: Int): Boolean {
        return number.toString().contains("7")
    }
}

fun main() {
    var number = 1234567
    println("Number of digits in $number is ${NumberOfDigitsInAnInteger().isSeven(number)}")

}
