package java11;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 11");
        System.out.println("Is empty: " + optional.isEmpty());
        System.out.println("Value: " + optional.orElseThrow());
    }
}
