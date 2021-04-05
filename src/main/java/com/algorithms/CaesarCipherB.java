package com.algorithms;

public class CaesarCipherB {
    private char encodeLetter(char letter, int a, int b, int n) {
        int letterCode = letter - 65;
        int newLetter = (letterCode * a + b) % n;
        return (char)(newLetter + 65);
    }

    public void encode(String word, int a, int b, int n) {
        // Zakodowanie slowa
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += encodeLetter(word.charAt(i), a, b, n);
        }
        System.out.println(result);
    }
}
