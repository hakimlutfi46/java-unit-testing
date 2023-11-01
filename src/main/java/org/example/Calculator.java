package org.example;

import java.util.stream.DoubleStream;

public class Calculator {

//    Method untuk penjumlahan
    static double add(double... operands) {
        // Menggunakan DoubleStream untuk menjumlahkan semua operan
        return DoubleStream.of(operands).sum();
    }

//    Meethod untuk perkalian
    static double multiply(double... operands) {
        // Menggunakan DoubleStream dan reduce() untuk mengalikan semua operan
        // Nilai awal adalah 1, sehingga operasi perkalian dimulai dari 1
        return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }
}
