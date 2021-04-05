package com.algorithms;

public class CaesarCipherB {

    private char encodeLetter(char letter, int a, int b, int n) {
        int letterCode = letter - 65;
        int newLetter = (letterCode * a + b) % n;
        return (char)(newLetter + 65);
    }

    private char decodeLetter(char letter, int c, int b, int n) {
        int letterCode = letter - 65;
//        if (letterCode < b) {
//            System.out.println(letterCode - b);
//            System.out.println(c * (letterCode - b));
//            System.out.println((c * (letterCode - b)) % n);
//        }
        int oldLetter = (c * (letterCode - b)) % n;
        if (oldLetter < 0) {
            oldLetter = n - Math.abs(oldLetter);
        }
        return (char)(oldLetter + 65);
    }

    // Znalezienie odwrotnosci modularna A (mod N) = i.
    private int reverseModulo(int a, int n) {
        for (int i = 0; i < n; i++) {
            if (a*i % n == 1) {
                return i;
            }
        }
        return -1;
    }

    public String encode(String word, int a, int b, int n) {
        // Zakodowanie slowa.
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += encodeLetter(word.charAt(i), a, b, n);
        }
        return result;
    }

    public String decode(String word, int a, int b, int n) {
        // Odkodowanie slowa.
        int c = reverseModulo(a, n);
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += decodeLetter(word.charAt(i), c, b, n);
        }
        return result;
    }
}
