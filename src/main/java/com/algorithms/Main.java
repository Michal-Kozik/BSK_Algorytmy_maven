package com.algorithms;

public class Main {

    public static void main(String[] args) {

        String word = "CRYPTOGRAPHY";   // slowo.
        String key = "BREAK";   // klucz.
        String word2 = "HEESPNIRRSSEESEIYASCBTEMGEPNANDICTRTAHSOIEERO";

        VigenereCipher vigenereCipher = new VigenereCipher();
        vigenereCipher.encode(word, key);

    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
