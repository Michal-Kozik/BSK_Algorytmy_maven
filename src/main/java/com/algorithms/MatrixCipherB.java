package com.algorithms;

import java.util.Arrays;
import java.util.List;

public class MatrixCipherB {

    public String encode(String word, String key) {
        int rows = word.length()/key.length() + 1;
        int cols = key.length();
        char[][] matrix = new char[rows][cols];
        int iterator = 0;

        // Wstawienie liter do macierzy.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (iterator < word.length()) {
                    matrix[i][j] = word.charAt(iterator);
                } else {
                    matrix[i][j] = '0';
                }
                iterator++;
            }
        }

        // Wstawienie odpowiednich liczb do klucza.
        Integer[] keyNumbers = new Integer[cols];
        int iteratorKey = 1;
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < key.length(); j++) {
                // jesli taki sam znak
                if (i == (int)key.charAt(j)) {
                    keyNumbers[j] = iteratorKey;
                    iteratorKey++;
                }
            }
        }

        // Odczytanie zaszyfrowanej wiadomosci.
        String result = "";
        List<Integer> keyNumbersList = Arrays.asList(keyNumbers);
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (matrix[i][keyNumbersList.indexOf(j+1)] != '0') {
                    result += matrix[i][keyNumbersList.indexOf(j+1)];
                }
            }
        }

        return result;
    }

    public String decode(String word, String key) {
        int rows = word.length()/key.length() + 1;
        int cols = key.length();
        char[][] matrix = new char[rows][cols];
        int iterator = 0;

        // Wstawienie zer do pustych komorek.
        int spaces = rows * cols - word.length();
        int index = cols - 1;
        while (spaces > 0) {
            matrix[rows - 1][index] = '0';
            spaces--;
            index--;
        }

        // Wstawienie odpowiednich liczb do klucza.
        Integer[] keyNumbers = new Integer[cols];
        int iteratorKey = 1;
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < key.length(); j++) {
                // jesli taki sam znak
                if (i == (int)key.charAt(j)) {
                    keyNumbers[j] = iteratorKey;
                    iteratorKey++;
                }
            }
        }

        // Wstawienie liter do macierzy.
        List<Integer> keyNumbersList = Arrays.asList(keyNumbers);
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (matrix[i][keyNumbersList.indexOf(j+1)] != '0') {
                    matrix[i][keyNumbersList.indexOf(j+1)] = word.charAt(iterator);
                    iterator++;
                }
            }
        }

        // Odczytanie liter z macierzy w poprawnej kolejnosci.
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result += matrix[i][j];
            }
        }

        // Usuniecie zer.
        result = result.replace("0", "");

        return result;
    }
}
