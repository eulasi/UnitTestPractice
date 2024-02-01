package com.example.unittestpractice.challenges.challengeOne
// Class responsible for checking whether an alphabet is a vowel or consonant
class VowelConsonantAlphabet {
    // Function to check if a given letter is a vowel
    fun isVowel(letter: Char): Boolean {
        return when (letter) {
            'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
            else -> false
        }
    }
    // Function to check if a given letter is a consonant
    fun isConsonant(letter: Char): Boolean {
        return !isVowel(letter)
    }
    // Function to check if a given character is a letter
    fun isALetter(letter: Char): Boolean {
        return letter in 'a'..'z' || letter in 'A'..'Z'
    }
    // Function to check if a given character is a digit
    fun isADigit(letter: Char): Boolean {
        return letter in '0'..'9'
    }
    // Function to check if a given character is not a vowel or consonant
    fun isNotAVowelOrConsonant(letter: Char): Boolean {
        return isALetter(letter) && !isVowel(letter)
    }
}

fun main() {
    val vowelConsonantAlphabet = VowelConsonantAlphabet()
    println(vowelConsonantAlphabet.isVowel('a'))
    println(vowelConsonantAlphabet.isConsonant('b'))
    println(vowelConsonantAlphabet.isALetter('a'))
    println(vowelConsonantAlphabet.isADigit('1'))
    println(vowelConsonantAlphabet.isNotAVowelOrConsonant('b'))
}
