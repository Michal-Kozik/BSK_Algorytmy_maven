package com.algorithms;

public class Main {

    public static void main(String[] args) {

        String word = "HEREISASECRETMESSAGEENCIPHEREDBYTRANSPOSITION";   // slowo.
        String key = "CONVENIENCE";   // klucz.
        String word2 = "HECRNCEYIISEPSGDIRNTOAAESRMPNSSROEEBTETIAEEHS";

        MatrixCipherC matrixCipherC = new MatrixCipherC();
        matrixCipherC.encode(word, key);

    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
