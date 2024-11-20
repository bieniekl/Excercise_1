package org.example;
import java.util.Random;

public class TokenGeneratorASCII {

    public static String tokenGeneratorASCII(int length) {

        if (length != 5 && length != 10 && length != 15) {
            throw new IllegalArgumentException("Invalid token length! Supported lengths are 5, 10, and 15.");
        }

        Random random = new Random();
        StringBuilder token = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int asciiCode;

            int group = random.nextInt(4); // 4 groups [a-z][A-Z][0-9][!@#$%^&*()]
            switch (group) {
                case 0:
                    asciiCode = random.nextInt(26) + 97; // ASCII 97 to 122
                    break;
                case 1:
                    asciiCode = random.nextInt(26) + 65; // ASCII 65 to 90
                    break;
                case 2:
                    asciiCode = random.nextInt(10) + 48; // ASCII 48 to 57
                    break;
                case 3:
                    int[] specialChars = {33, 64, 35, 36, 37, 94, 38, 42, 40, 41}; // ASCII for !@#$%^&*()
                    asciiCode = specialChars[random.nextInt(specialChars.length)];
                    break;
                default:
                    asciiCode = 0;
            }

            // add char based on ascii code
            token.append((char) asciiCode);
        }

        return token.toString();
    }

}

