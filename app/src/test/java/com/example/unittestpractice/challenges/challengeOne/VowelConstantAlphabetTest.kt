package com.example.unittestpractice.challenges.challengeOne

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
// Test class for VowelConsonantAlphabet
class VowelConsonantAlphabetTest {
    var vowelConsonantAlphabet: VowelConsonantAlphabet? = null
    // Setup method to initialize the VowelConsonantAlphabet instance before each test
    @Before
    fun setUp() {
        vowelConsonantAlphabet = VowelConsonantAlphabet()
    }
    // Teardown method to clean up resources after each test
    @After
    fun tearDown() {
        vowelConsonantAlphabet = null
    }
    // Test case to check if 'b' is a consonant
    @Test
    fun testIsConsonant() {
        assertTrue(vowelConsonantAlphabet!!.isConsonant('b'))
    }
    // Test case to check if 'a' is a vowel
    @Test
    fun testIsVowel() {
        assertTrue(vowelConsonantAlphabet!!.isVowel('a'))
    }
    // Test case to check if 'a' is a letter
    @Test
    fun testIsALetter() {
        assertTrue(vowelConsonantAlphabet!!.isALetter('a'))
    }
    // Test case to check if '1' is a digit
    @Test
    fun testisADigit() {
        val vowelConstantAlphabet = VowelConsonantAlphabet()
        assertTrue(vowelConstantAlphabet.isADigit('1'))
    }
    // Test case to check if 'a' is not a consonant
    @Test
    fun testIsNotAVowelOrConsonant() {
        assertFalse(vowelConsonantAlphabet!!.isNotAVowelOrConsonant('1'))
    }

}
