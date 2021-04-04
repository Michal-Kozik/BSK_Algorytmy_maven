package com.algorithms;

public class Main {

    public static void main(String[] args) {

        String word = "CRYPTOGRAPHY";   // slowo.
        String key = "BREAK";   // klucz.
        String word2 = "DICPDPXVAZIP";

        VigenereCipher vigenereCipher = new VigenereCipher();
        String word3 = vigenereCipher.encode(word, key);
        System.out.println(word3);
        String word4 = vigenereCipher.decode(word3, key);
        System.out.println(word4);

    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
