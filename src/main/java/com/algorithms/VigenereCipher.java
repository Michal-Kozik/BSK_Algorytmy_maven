package com.algorithms;

public class VigenereCipher {

    private char indexToLetter(int index) {
        if (index > 25)
            index %= 26;
        return (char)(index + 65);
    }

    private int letterToIndex(char letter) {
        if (letter < 'A' || letter > 'Z')
            return -1;
        else
            return (int)(letter) - 65;
    }

    public String encode(String word, String prototypeKey) {
        // Uzupelnienie klucza.
        String key = "";
        if (prototypeKey.length() < word.length()) {
            for (int i = 0; i < word.length(); i++) {
                key += prototypeKey.charAt(i % prototypeKey.length());
            }
        } else if (prototypeKey.length() > word.length()) {
            key = prototypeKey.substring(0, word.length());
        }

        // Stworzenie wielkiej tablicy do kodowania.
        char[][] matrix = new char[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                matrix[i][j] = indexToLetter(j + i);
            }
        }

        // Zakodowanie wiadomosci.
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += matrix[ letterToIndex(key.charAt(i)) ][ letterToIndex(word.charAt(i)) ];
        }

        return result;
    }

    public String decode(String word, String prototypeKey) {
        // Uzupelnienie klucza.
        String key = "";
        if (prototypeKey.length() < word.length()) {
            for (int i = 0; i < word.length(); i++) {
                key += prototypeKey.charAt(i % prototypeKey.length());
            }
        } else if (prototypeKey.length() > word.length()) {
            key = prototypeKey.substring(0, word.length());
        }

        // Stworzenie wielkiej tablicy do kodowania.
        char[][] matrix = new char[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                matrix[i][j] = indexToLetter(j + i);
            }
        }

        // Odkodowanie wiadomosci.
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (matrix[letterToIndex(key.charAt(i))][j] == word.charAt(i)) {
                    result += indexToLetter(j);
                }
            }
        }

        return result;
    }
}
