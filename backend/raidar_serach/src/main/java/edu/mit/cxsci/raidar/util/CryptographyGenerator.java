package edu.mit.cxsci.raidar.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptographyGenerator {

    public String generateMD2(String input) throws NoSuchAlgorithmException {
        return generateString(input, "MD2", 32);
    }

    public String generateMD5(String input) throws NoSuchAlgorithmException {
        return generateString(input, "MD5", 32);
    }

    public String generateSHA1(String input) throws NoSuchAlgorithmException {
        return generateString(input, "SHA-1", 40);
    }

    public String generateSHA256(String input) throws NoSuchAlgorithmException {
        return generateString(input, "SHA-256", 64);
    }

    public String generateSHA512(String input) throws NoSuchAlgorithmException {
        return generateString(input, "SHA-512", 128);
    }

    public String generateSHA384(String input) throws NoSuchAlgorithmException {
        return generateString(input, "SHA-384", 96);
    }

    private static String generateString(String input, String algorithm, int minLength) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[] bytes = messageDigest.digest(input.getBytes());
        BigInteger integer = new BigInteger(1, bytes);
        String result = integer.toString(16);
        while (result.length() < minLength) {
            result = "0" + result;
        }
        return result;
    }
}
