package com.algorithms;

public class Main {

    public static void main(String[] args) {

        String word = "HEREISASECRETMESSAGEENCIPHEREDBYTRANSPOSITION";   // slowo.
        String key = "CONVENIENCE";   // klucz.

        MatrixCipherB matrixCipherB = new MatrixCipherB();
        String encodedWord = matrixCipherB.encode(word, key);
        System.out.println(encodedWord);
    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
