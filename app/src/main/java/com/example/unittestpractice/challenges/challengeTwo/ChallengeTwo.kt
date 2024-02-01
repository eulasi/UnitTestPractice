package com.example.unittestpractice.challenges.challengeTwo

// Class responsible for determining whether a number is positive, negative, or zero
class IsPositiveOrNegativeNumber {
    // Function to check if a number is positive
    fun isPositive(number: Int): Int {
        // Returns 5 if positive, otherwise 0
        return if (number > 0) 5 else 0
    }
    // Function to check if a number is negative
    fun isNegative(number: Int): Int {
        // Returns -5 if negative, otherwise 0
        return if (number < 0) -5 else 0
    }
    // Function to check if a number is zero
    fun isZero(number: Int): Int {
        // Returns 2 if zero, otherwise 0
        return if (number == 0) 0 else 2
    }
}

fun main() {
    var number = 5
    val isPositiveOrNegativeNumber = IsPositiveOrNegativeNumber()
    println(isPositiveOrNegativeNumber.isPositive(5))
    println(isPositiveOrNegativeNumber.isNegative(-5))
    println(isPositiveOrNegativeNumber.isZero(0))


}
