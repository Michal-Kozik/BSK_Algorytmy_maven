package com.algorithms;

import java.util.Arrays;
import java.util.List;

public class MatrixCipherC {

    public String encode(String word, String key) {
        int cols = key.length();

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

        // Obliczenie jaka tablice trzeba zaalokowac.
        List<Integer> keyNumbersList = Arrays.asList(keyNumbers);
        int letters = 0;
        int rows = 0;
        for (int i = 0; i < cols; i++) {
            rows++;
            for (int j = 0; j <= keyNumbersList.indexOf(i+1); j++) {
                letters++;
            }
            // jezeli wykorzystanoby juz wszystkie litery...
            if (letters >= word.length()) {
                break;
            }
        }

        // Wstawienie liter do macierzy
        char[][] matrix = new char[rows][cols];
        int iterator = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= keyNumbersList.indexOf(i+1); j++) {
                if (iterator < word.length()) {
                    matrix[i][j] = word.charAt(iterator);
                } else {
                    matrix[i][j] = '0';
                }
                iterator++;
            }
        }

        // Odczytanie zaszyfrowanej wiadomosci
        String result = "";
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                // jezeli w komorce znajduje sie litera...
                if (matrix[i][keyNumbersList.indexOf(j+1)] != '0' && matrix[i][keyNumbersList.indexOf(j+1)] != 0) {
                    result += matrix[i][keyNumbersList.indexOf(j+1)];
                }
            }
        }

//        // Wyswietlenie macierzy
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println(result);
        return result;
    }

    public String decode(String word, String key) {
        int cols = key.length();

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

        // Obliczenie jaka tablice trzeba zaalokowac.
        List<Integer> keyNumbersList = Arrays.asList(keyNumbers);
        int letters = 0;
        int rows = 0;
        for (int i = 0; i < cols; i++) {
            rows++;
            for (int j = 0; j <= keyNumbersList.indexOf(i+1); j++) {
                letters++;
            }
            // jezeli wykorzystanoby juz wszystkie litery...
            if (letters >= word.length()) {
                break;
            }
        }

        // Zaznaczenie gwiazdkami w macierzy pozycji, na ktorych sa litery.
        char[][] matrix = new char[rows][cols];
        int iterator = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= keyNumbersList.indexOf(i+1); j++) {
                if (iterator < word.length()) {
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = '0';
                }
                iterator++;
            }
        }

        // Podmienienie gwiazdek na litery.
        iterator = 0;
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (matrix[i][keyNumbersList.indexOf(j+1)] == '*') {
                    matrix[i][keyNumbersList.indexOf(j+1)] = word.charAt(iterator);
                    iterator++;
                }
            }
        }

        // Odczytanie odszyfrowanej wiadomosci
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != '0' && matrix[i][j] != 0) {
                    result += matrix[i][j];
                }
            }
        }

//        // Wyswietlenie macierzy
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println(result);
        return result;
    }
}
