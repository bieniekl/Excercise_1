package org.example;

import com.mifmif.common.regex.Generex;


public class TokenGenerator {
    private static final String regex = "([a-z]|[A-Z]|[0-9]|[!@#$%^&*()])";
    private static final String regex2 = "[a-zA-Z0-9!@#$%^&*()]";

    public static String tokenGenerator(int characters) {

        if (characters != 5 && characters != 10 && characters != 15) {
            throw new IllegalArgumentException("Invalid token length! Supported lengths are 5, 10, and 15.");
        }
        String param = String.valueOf(characters);
        String regexFinal = (regex + "{" + param + "}");
        Generex generex = new Generex(regexFinal);
            // Generate random String
        String token = generex.random();

        return token;
    }
}

