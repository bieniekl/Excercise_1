package org.example;
import com.mifmif.common.regex.Generex;


public class TokenGenerator {
    private static String regex5 = "([a-z]|[A-Z]|[0-9]|[!@#$%^&*()]){5}";
    private static String regex10 = "([a-z]|[A-Z]|[0-9]|[!@#$%^&*()]){10}";
    private static String regex15 = "([a-z]|[A-Z]|[0-9]|[!@#$%^&*()]){15}";
    //   public static String token;
    private static Generex generex;
    private static String token;
    public static String tokenGenerator(int characters) {

        if (characters != 5 && characters != 10 && characters != 15) {
            throw new IllegalArgumentException("Invalid token length! Supported lengths are 5, 10, and 15.");
        }


switch (characters) {
    case 5:
        generex = new Generex(regex5);
        // Generate random String
        token = generex.random();
        break;
    case 10:
        generex = new Generex(regex10);
        token = generex.random();
        break;
    case 15:
        generex = new Generex(regex15);
        token = generex.random();
        break;
}
                return token;
            }
        }

