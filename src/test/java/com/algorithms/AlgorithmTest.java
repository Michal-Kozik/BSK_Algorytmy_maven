package com.algorithms;

import org.junit.jupiter.api.Test;

public class AlgorithmTest {

    @Test
    public void RailFenceEncodeTest() {
        RailFence railFence = new RailFence();
        String result = railFence.encode("ALAMAKOTAPL", 3);
        System.out.println(result);
        assert result.equals("AAALMKTPAOL");
    }

    @Test
    public void RailFenceDecodeTest() {
        RailFence railFence = new RailFence();
        String result = railFence.decode("AAALMKTPAOL", 3);
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void MatrixCipherAEncodeTest() {
        MatrixCipherA matrixCipherA = new MatrixCipherA();
        int[] key = {3, 4, 1, 5, 2};
        String result = matrixCipherA.encode("ALAMAKOTAPL", 5, key);
        System.out.println(result);
        assert result.equals("AMAALTAKPOL");
    }

    @Test
    public void MatrixCipherADecodeTest() {
        MatrixCipherA matrixCipherA = new MatrixCipherA();
        int[] key = {3, 4, 1, 5, 2};
        String result = matrixCipherA.decode("AMAALTAKPOL", 5, key);
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void MatrixCipherBEncodeTest() {
        MatrixCipherB matrixCipherB = new MatrixCipherB();
        String result = matrixCipherB.encode("ALAMAKOTAPL", "CONVENIENCEPL");
        System.out.println(result);
        assert result.equals("APATLOAKALM");
    }

    @Test
    public void MatrixCipherBDecodeTest() {
        MatrixCipherB matrixCipherB = new MatrixCipherB();
        String result = matrixCipherB.decode("APATLOAKALM", "CONVENIENCEPL");
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void MatrixCipherCEncodeTest() {
        MatrixCipherC matrixCipherC = new MatrixCipherC();
        String result = matrixCipherC.encode("ALAMAKOTAPL", "CONVENIENCEPL");
        System.out.println(result);
        assert result.equals("ALLKATMOPAA");
    }

    @Test
    public void MatrixCipherCDecodeTest() {
        MatrixCipherC matrixCipherC = new MatrixCipherC();
        String result = matrixCipherC.decode("ALLKATMOPAA", "CONVENIENCEPL");
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void CaesarCipherBEncodeTest() {
        CaesarCipherB caesarCipherB = new CaesarCipherB();
        String result = caesarCipherB.encode("ALAMAKOTAPL", 7, 5, 26);
        System.out.println(result);
        assert result.equals("FEFLFXZIFGE");
    }

    @Test
    public void CaesarCipherBDecodeTest() {
        CaesarCipherB caesarCipherB = new CaesarCipherB();
        String result = caesarCipherB.decode("FEFLFXZIFGE", 7, 5, 26);
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }

    @Test
    public void VigenereCipherEncodeTest() {
        VigenereCipher vigenereCipher = new VigenereCipher();
        String result = vigenereCipher.encode("ALAMAKOTAPL", "BREAKPL");
        System.out.println(result);
        assert result.equals("BCEMKZZURTL");
    }

    @Test
    public void VigenereCipherDecodeTest() {
        VigenereCipher vigenereCipher = new VigenereCipher();
        String result = vigenereCipher.decode("BCEMKZZURTL", "BREAKPL");
        System.out.println(result);
        assert result.equals("ALAMAKOTAPL");
    }
}
