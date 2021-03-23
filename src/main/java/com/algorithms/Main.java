package com.algorithms;

public class Main {

    public static void main(String[] args) {

        int d = 5;                      // dlugosc klucza.
        String word = "YPCTRRAOPGHY";   // slowo.
        int [] key = {3, 4, 1, 5, 2};   // klucz.

        MatrixCipherA matrixCipherA = new MatrixCipherA();
//        String encodedWord = matrixCipherA.encode(word, d, key);
//        System.out.println(encodedWord);
        String decodedWord = matrixCipherA.decode(word, d, key);
        System.out.println(decodedWord);
    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
