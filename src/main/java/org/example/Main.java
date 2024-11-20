package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("token: " + TokenGenerator.tokenGenerator(5));
        System.out.println("token: " + TokenGenerator.tokenGenerator(15));
        System.out.println("token: " + TokenGenerator.tokenGenerator(10));
        //System.out.println("token: " + TokenGenerator.tokenGenerator(111));
        System.out.println("tokenASCII: " + TokenGeneratorASCII.tokenGeneratorASCII(5));
        System.out.println("tokenASCII: " + TokenGeneratorASCII.tokenGeneratorASCII(15));
        System.out.println("tokenASCII: " + TokenGeneratorASCII.tokenGeneratorASCII(10));
        //System.out.println("tokenASCII: " + TokenGeneratorASCII.tokenGeneratorASCII(111));
        }
    }
