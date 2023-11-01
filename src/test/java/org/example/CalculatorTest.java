package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

//  Pengujian operasi penjumlahan
    @Test
    @DisplayName("Add two numbers")
    void add() {

        // Memastikan bahwa hasil penjumlahan dari 2 + 2 adalah 4
        assertEquals(4, Calculator.add(2, 2));
    }

//  Pengujian operasi perkalian
    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {

        assertAll(

                // Memastikan bahwa hasil perkalian dari 2 * 2 adalah 4
                () -> assertEquals(4, Calculator.multiply(2, 2)),

                // Pengujian untuk perkalian dengan angka negatif
                () -> assertEquals(-4, Calculator.multiply(2, -2)),

                // Pengujian untuk perkalian dua angka negatif
                () -> assertEquals(4, Calculator.multiply(-2, -2)),

                // Pengujian untuk perkalian dengan angka 0
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}
