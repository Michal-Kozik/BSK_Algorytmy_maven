package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MatrixCipherA {

    public String encode(String word, int d, int [] key) {
        // BRAK SPRAWDZENIA CZY WPISYWANE DANE SA POPRAWNE.
        char[][] matrix = new char[word.length()/d + 1][d];
        int iterator = 0;

        // Wpisanie slowa do macierzy.
        for (int i = 0; i < word.length()/d+1; i++) {
            for (int j = 0; j < d; j++) {
                // Gdy skonczy sie slowo, wpisywane sa zera.
                if (iterator >= word.length()) {
                    matrix[i][j] = '0';
                } else {
                    matrix[i][j] = word.charAt(iterator);
                }
                iterator++;
            }
        }

        // Odczytanie zakodowanego slowa
        String result = "";
        for (int j = 0; j < word.length()/d + 1; j++) {
            for (int i = 0; i < d; i++) {
                result += matrix[j][key[i]-1];
            }
        }
        result = result.replace("0", "");
        return result;
    }

    public String decode(String word, int d, int [] key) {
        //BRAK SPRAWDZENIA CZY WPISYWANE DANE SA POPRAWNE.
        char[][] matrix = new char[word.length()/d + 1][d];
        int iterator = 0;

        // Ilosc komorek - ilosc liter = puste komorki.
        int space = ((word.length()/d + 1) * d) - word.length();
        // Wpisanie zer do pustych komorek od konca macierzy.
        for (int i = d-1; space > 0; i--) {
            matrix[word.length()/d][i] = '0';
            space--;
        }

        // Wpisywanie liter na swoje miejsca w macierzy.
        for (int j = 0; j < word.length()/d + 1; j++) {
            for (int i = 0; i < d; i++) {
                if (matrix[j][key[i]-1] != '0') {
                    matrix[j][key[i]-1] = word.charAt(iterator);
                    iterator++;
                }
            }
        }

        // Oczytanie liter w poprawnej kolejnosci
        String result = "";
        for (int j = 0; j < word.length()/d + 1; j++) {
            for (int i = 0; i < d; i++) {
                result += matrix[j][i];
            }
        }
        result = result.replace("0", "");
        return result;
    }
}
