package functionalinterface;

import java.util.Optional;

public class optionals {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("hello")
            .orElseThrow(() -> new IllegalStateException("exception"));

        System.out.println(value);
    }
}
