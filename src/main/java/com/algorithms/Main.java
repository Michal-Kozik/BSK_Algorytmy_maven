package com.algorithms;

public class Main {

    public static void main(String[] args) {

        String word = "CRYPTOGRAPHY";   // slowo.
        String key = "BREAK";   // klucz.
        String word2 = "ABECADLO";

        CaesarCipherB caesarCipherB = new CaesarCipherB();
        String word3 = caesarCipherB.encode(word, 7, 5, 26);
        System.out.println(word3);
        String word4 = caesarCipherB.decode(word3, 7, 5, 26);
        System.out.println(word4);

    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
