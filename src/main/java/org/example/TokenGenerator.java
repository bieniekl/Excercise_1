package org.example;

import com.mifmif.common.regex.Generex;


public class TokenGenerator {
    private static final String regex = "([a-z]|[A-Z]|[0-9]|[!@#$%^&*()])";
    //   public static String token;
    private static Generex generex;
    private static String token;
    private static String param;

    public static String tokenGenerator(int characters) {

        if (characters != 5 && characters != 10 && characters != 15) {
            throw new IllegalArgumentException("Invalid token length! Supported lengths are 5, 10, and 15.");
        }
            param = String.valueOf(characters);
            String regexFinal = (regex + "{" + param + "}");
            generex = new Generex(regexFinal);
            // Generate random String
            token = generex.random();

        return token;
    }
}

