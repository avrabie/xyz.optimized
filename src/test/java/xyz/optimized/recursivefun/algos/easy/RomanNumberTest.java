package xyz.optimized.recursivefun.algos.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// The RomanNumberTest class is responsible for testing the methods of the RomanNumber class.
public class RomanNumberTest {

    @Test
    void testRomanToInt() {
        RomanNumber romanNumber = new RomanNumber();

        // Testing a simple case, "I" equals to 1 in Roman numeral
        Assertions.assertEquals(1, romanNumber.romanToInt("I"), "Checking if 'I' equals 1");

        // Testing a case, "IV" equals to 4 in Roman numeral
        Assertions.assertEquals(4, romanNumber.romanToInt("IV"), "Checking if 'IV' equals 4");

        // Testing a case, "IX" equals to 9 in Roman numeral
        Assertions.assertEquals(9, romanNumber.romanToInt("IX"), "Checking if 'IX' equals 9");

        // Testing a case, "LVIII" equals to 58 in Roman numeral
        Assertions.assertEquals(58, romanNumber.romanToInt("LVIII"), "Checking if 'LVIII' equals 58");

        // Testing a case, "MCMXCIV" equals to 1994 in Roman numeral
        Assertions.assertEquals(1994, romanNumber.romanToInt("MCMXCIV"), "Checking if 'MCMXCIV' equals 1994");
    }
}