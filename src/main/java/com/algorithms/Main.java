package com.algorithms;

public class Main {

    public static void main(String[] args) {

        String word = "CRYPTOGRAPHY";   // slowo.
        String key = "BREAK";   // klucz.
        String word2 = "DICPDPXVAZIP";

        CaesarCipherB caesarCipherB = new CaesarCipherB();
        caesarCipherB.encode(word, 7, 5, 26);

    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
