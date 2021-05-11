package com.algorithms;

import org.junit.jupiter.api.Test;

public class AlgorithmTest {

    @Test
    public void railFenceEncodeTest() {
        RailFence railFence = new RailFence();
        String result = railFence.encode("ALAMAKOTAPL", 3);
        System.out.println(result);
        assert result.equals("AAALMKTPAOL");
    }

    @Test
    public void railFenceDecodeTest() {
        RailFence railFence = new RailFence();
        String result = railFence.decode("AAALMKTPAOL", 3);
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void matrixCipherAEncodeTest() {
        MatrixCipherA matrixCipherA = new MatrixCipherA();
        int[] key = {3, 4, 1, 5, 2};
        String result = matrixCipherA.encode("ALAMAKOTAPL", 5, key);
        System.out.println(result);
        assert result.equals("AMAALTAKPOL");
    }

    @Test
    public void matrixCipherADecodeTest() {
        MatrixCipherA matrixCipherA = new MatrixCipherA();
        int[] key = {3, 4, 1, 5, 2};
        String result = matrixCipherA.decode("AMAALTAKPOL", 5, key);
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void matrixCipherBEncodeTest() {
        MatrixCipherB matrixCipherB = new MatrixCipherB();
        String result = matrixCipherB.encode("ALAMAKOTAPL", "CONVENIENCEPL");
        System.out.println(result);
        assert result.equals("APATLOAKALM");
    }

    @Test
    public void matrixCipherBDecodeTest() {
        MatrixCipherB matrixCipherB = new MatrixCipherB();
        String result = matrixCipherB.decode("APATLOAKALM", "CONVENIENCEPL");
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void matrixCipherCEncodeTest() {
        MatrixCipherC matrixCipherC = new MatrixCipherC();
        String result = matrixCipherC.encode("ALAMAKOTAPL", "CONVENIENCEPL");
        System.out.println(result);
        assert result.equals("ALLKATMOPAA");
    }

    @Test
    public void matrixCipherCDecodeTest() {
        MatrixCipherC matrixCipherC = new MatrixCipherC();
        String result = matrixCipherC.decode("ALLKATMOPAA", "CONVENIENCEPL");
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void caesarCipherBEncodeTest() {
        CaesarCipherB caesarCipherB = new CaesarCipherB();
        String result = caesarCipherB.encode("ALAMAKOTAPL", 7, 5, 26);
        System.out.println(result);
        assert result.equals("FEFLFXZIFGE");
    }

    @Test
    public void caesarCipherBDecodeTest() {
        CaesarCipherB caesarCipherB = new CaesarCipherB();
        String result = caesarCipherB.decode("FEFLFXZIFGE", 7, 5, 26);
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void vigenereCipherEncodeTest() {
        VigenereCipher vigenereCipher = new VigenereCipher();
        String result = vigenereCipher.encode("ALAMAKOTAPL", "BREAKPL");
        System.out.println(result);
        assert result.equals("BCEMKZZURTL");
    }

    @Test
    public void vigenereCipherDecodeTest() {
        VigenereCipher vigenereCipher = new VigenereCipher();
        String result = vigenereCipher.decode("BCEMKZZURTL", "BREAKPL");
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void finalTest() {
        RailFence railFence = new RailFence();
        MatrixCipherA matrixCipherA = new MatrixCipherA();
        MatrixCipherB matrixCipherB = new MatrixCipherB();
        MatrixCipherC matrixCipherC = new MatrixCipherC();
        CaesarCipherB caesarCipherB = new CaesarCipherB();
        VigenereCipher vigenereCipher = new VigenereCipher();

        String word = "CRYPTOGRAPHY";

        // Wyniki szyfrowania
        String railFenceEncodeResult = railFence.encode(word, 3);
        int[] key = {3, 4, 1, 5, 2};
        String matrixCipherAEncodeResult = matrixCipherA.encode(word, 5, key);
        String matrixCipherBEncodeResult = matrixCipherB.encode(word, "CONVENIENCE");
        String matrixCipherCEncodeResult = matrixCipherC.encode(word, "CONVENIENCE");
        String caesarCipherBEncodeResult = caesarCipherB.encode(word, 7, 5, 26);
        String vigenereCipherEncodeResult = vigenereCipher.encode(word, "BREAK");

        System.out.println("Szyfrowanie:");
        System.out.println("RailFence: " + railFenceEncodeResult);
        System.out.println("MatrixCipherA: " + matrixCipherAEncodeResult);
        System.out.println("MatrixCipherB: " + matrixCipherBEncodeResult);
        System.out.println("MatrixCipherC: " + matrixCipherCEncodeResult);
        System.out.println("CaesarCipherB: " + caesarCipherBEncodeResult);
        System.out.println("VigenereCipher: " + vigenereCipherEncodeResult);

        // Wyniki deszyfracji
        String railFenceDecodeResult = railFence.decode(railFenceEncodeResult, 3);
        String matrixCipherADecodeResult = matrixCipherA.decode(matrixCipherAEncodeResult, 5, key);
        String matrixCipherBDecodeResult = matrixCipherB.decode(matrixCipherBEncodeResult, "CONVENIENCE");
        String matrixCipherCDecodeResult = matrixCipherC.decode(matrixCipherCEncodeResult, "CONVENIENCE");
        String caesarCipherBDecodeResult = caesarCipherB.decode(caesarCipherBEncodeResult, 7, 5, 26);
        String vigenereCipherDecodeResult = vigenereCipher.decode(vigenereCipherEncodeResult, "BREAK");

        System.out.println("\nDeszyfracja:");
        System.out.println("RailFence: " + railFenceDecodeResult);
        System.out.println("MatrixCipherA: " + matrixCipherADecodeResult);
        System.out.println("MatrixCipherB: " + matrixCipherBDecodeResult);
        System.out.println("MatrixCipherC: " + matrixCipherCDecodeResult);
        System.out.println("CaesarCipherB: " + caesarCipherBDecodeResult);
        System.out.println("VigenereCipher: " + vigenereCipherDecodeResult);
    }
}
