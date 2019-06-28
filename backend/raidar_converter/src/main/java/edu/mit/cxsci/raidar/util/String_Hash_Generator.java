package edu.mit.cxsci.raidar.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class String_Hash_Generator  {

    public static void main(String args[]) throws NoSuchAlgorithmException {

        String input = "safsfsdewfretgfhryrt6uytrhbfghy4rgfwer3t4eyrthgfdsvfawr3t4ey5rthdr6ut";

        CryptographyGenerator generator = new CryptographyGenerator();

        System.out.println("\nMD2: " + generator.generateMD2(input)
                + "\nMD5: " + generator.generateMD5(input)
                + "\nSHA-1: " + generator.generateSHA1(input)
                + "\nSHA-256: " + generator.generateSHA256(input)
                + "\nSHA-384: " + generator.generateSHA384(input)
                + "\nSHA-512: " + generator.generateSHA512(input));
    }
}


