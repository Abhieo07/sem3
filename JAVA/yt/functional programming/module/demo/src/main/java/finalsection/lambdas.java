package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class lambdas {
    public static void main(String[] args) {
        Function <String, String> upperCaseName = name -> {
            //logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        BiFunction <String, Integer, String> upperCase = (name, age) -> {
            //logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        upperCase.apply("Alex", 20);
        upperCaseName.apply("Amanda");
    }
}
