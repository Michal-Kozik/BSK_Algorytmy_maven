package com.algorithms;

public class Main {

    public static void main(String[] args) {

        int k = 3;
        String word = "CRYPTOGRAPHY";

        RailFence railFence = new RailFence();
        String codedMessage = railFence.code(word, k);
        System.out.println(codedMessage);
        String decodedMessage = railFence.decode(codedMessage, k);
        System.out.println(decodedMessage);
    }

    public static double max(double a, double b) {
        return a>b ? a : b;
    }
}
