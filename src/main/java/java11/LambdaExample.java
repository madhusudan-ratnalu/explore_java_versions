package java11;

import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        Consumer<String> consumer = (var s) -> System.out.println(s.toUpperCase());
        Consumer<String> consumer1= (String s) -> System.out.println(s.toUpperCase()+ 1);
        list.forEach(consumer);
        list.forEach(consumer1);
    }
   /* Local-Variable Syntax for Lambda Parameters
    Java 11 allows the use of var in lambda expressions, enabling the use of local
    variable type inference in lambda parameters
    */
}
