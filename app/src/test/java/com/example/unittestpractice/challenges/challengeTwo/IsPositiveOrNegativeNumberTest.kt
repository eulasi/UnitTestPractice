package com.example.unittestpractice.challenges.challengeTwo

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

// Test class for IsPositiveOrNegativeNumber
class IsPositiveOrNegativeNumberTest {
    var isPositiveOrNegativeNumber : IsPositiveOrNegativeNumber? = null
    // Setup method to initialize the IsPositiveOrNegativeNumber instance before each test
    @Before
    fun setUp() {
        isPositiveOrNegativeNumber = IsPositiveOrNegativeNumber()
    }
    // Teardown method to clean up resources after each test
    @After
    fun tearDown() {
        isPositiveOrNegativeNumber = null
    }
    // Test case to check if 5 is a positive number
    @Test
    fun checkPositiveNumber() {
        val number = 5
        val result = isPositiveOrNegativeNumber?.isPositive(number)
        // assertEquals checks if the actual result equals the expected result
        assertEquals("Positive Number",5, result)
    }
    // Test case to check if -5 is a negative number
    @Test
    fun checkNegativeNumber() {
        val number = -5
        val result = isPositiveOrNegativeNumber?.isNegative(number)
        // assertEquals checks if the actual result equals the expected result
        assertEquals("Negative Number",-5, result)
    }
    // Test case to check if 0 is a zero
    @Test
    fun checkZero() {
        val number = 0
        // assertEquals checks if the actual result equals the expected result
        val result = isPositiveOrNegativeNumber?.isZero(number)
        assertEquals("Zero",0, result)
    }
}