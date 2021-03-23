package com.algorithms;

public class Main {

    public static void main(String[] args) {

        int d = 5;
        String word = "CRYPTOGRAPHY";
        int [] key = {3, 4, 1, 5, 2};

        MatrixCipherA matrixCipherA = new MatrixCipherA();
        String encodedWord = matrixCipherA.encode(word, d, key);
        System.out.println(encodedWord);
    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
