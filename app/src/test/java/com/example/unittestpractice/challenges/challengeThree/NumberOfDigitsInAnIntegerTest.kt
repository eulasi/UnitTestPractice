package com.example.unittestpractice.challenges.challengeThree

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class NumberOfDigitsInAnIntegerTest {
    var numberOfDigitsInAnInteger : NumberOfDigitsInAnInteger? = null
    // Setup method to initialize the NumberOfDigitsInAnInteger instance before each test
    @Before
    fun setUp(){
        numberOfDigitsInAnInteger = NumberOfDigitsInAnInteger()
    }
    // Teardown method to clean up resources after each test
    @After
    fun tearDown(){
        numberOfDigitsInAnInteger = null
    }

    // Test case to check if the number 1234567 contains the digit 7
    @Test
    fun testNumberOfDigitsIsSeven(){
        val result = numberOfDigitsInAnInteger?.isSeven(1234567)!!
        // assertTrue checks if the provided condition is true
        assertTrue(result)
    }

    // Test case to check if the number 123456 does not contain the digit 7
    @Test
    fun testNumberOfDigitsIsNotSeven(){
        val result = numberOfDigitsInAnInteger?.isSeven(123456)
        // assertNotEquals checks if the actual result is not equal to the expected result
        assertNotEquals(7, result)
    }
}