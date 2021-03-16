package com.algorithms;

public class RailFence {

    public String code(String word, int key) {
        char[][] fence = new char[word.length()][key];
        boolean down = false;
        int row = 0;
        int col = 0;

        // Tworzenie plotka.
        for (int i = 0; i < word.length(); i++) {
            // Odbijanie sie od podlogi i sufitu.
            if (row == 0 || row == key - 1)
                down = !down;
            // Wstawianie litery.
            fence[col][row] = word.charAt(i);
            // Znalezienie nowej pozycji
            col++;
            if (down)
                row++;
            else
                row--;
        }

        // Odczytywanie plotka
        String result = "";
        for (int j = 0; j < key; j++) {
            for (int i = 0; i < word.length(); i++) {
                // Jezeli znaleziono litere
                if (fence[i][j] != 0) {
                    result += fence[i][j];
                }
            }
        }
        return result;
    }

    public String decode(String word, int key) {
        char[][] fence = new char[word.length()][key];
        boolean down = false;
        int row = 0;
        int col = 0;

        // Tworzenie plotka.
        for (int i = 0; i < word.length(); i++) {
            // Odbijanie sie od sufitu i podlogi.
            if (row == 0 || row == key - 1)
                down = !down;
            // Zaznaczenie miejsca wystapienia litery.
            fence[col][row] = '*';
            // Znalezienie nastepnego miejsca.
            col++;
            if (down)
                row++;
            else
                row--;
        }

        String result = "";
        int counter = 0;
        // Zastapienie gwiazdek literami.
        for (int j = 0; j < key; j++) {
            for (int i = 0; i < word.length(); i++) {
                // Podmienianie gwiazdek na litery z szyfru idac od gory do dolu
                // z lewej do prawej.
                if (fence[i][j] == '*') {
                    fence[i][j] = word.charAt(counter);
                    counter++;
                }
            }
        }

        down = false;
        col = 0;
        row = 0;
        // Odczytanie hasla.
        for (int i = 0; i < word.length(); i++) {
            // Odbijanie sie.
            if (row == 0 || row == key - 1)
                down = !down;
            // Przypisanie.
            result += fence[col][row];
            // Przejscie dalej.
            col++;
            if (down)
                row++;
            else
                row--;
        }
        return result;
    }
}
