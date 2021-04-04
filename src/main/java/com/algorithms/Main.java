package com.algorithms;

public class Main {

    public static void main(String[] args) {

        String word = "HEREISASECRETMESSAGEENCIPHEREDBYTRANSPOSITION";   // slowo.
        String key = "CONVENIENCE";   // klucz.
        String word2 = "HEESPNIRRSSEESEIYASCBTEMGEPNANDICTRTAHSOIEERO";

        MatrixCipherC matrixCipherC = new MatrixCipherC();
        String word3 = matrixCipherC.encode(word, key);
        System.out.println(word3);
        String word4 = matrixCipherC.decode(word3, key);
        System.out.println(word4);

    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
