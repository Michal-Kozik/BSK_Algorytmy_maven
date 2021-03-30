package com.algorithms;

public class Main {

    public static void main(String[] args) {

        String word = "HEREISASECRETMESSAGEENCIPHEREDBYTRANSPOSITION";   // slowo.
        String key = "CONVENIENCE";   // klucz.
        String word2 = "HECRNCEYIISEPSGDIRNTOAAESRMPNSSROEEBTETIAEEHS";

        MatrixCipherB matrixCipherB = new MatrixCipherB();
        String encodedWord = matrixCipherB.encode(word, key);
        System.out.println(encodedWord);
        String decodedWord = matrixCipherB.decode(word2, key);
        System.out.println(decodedWord);
    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
