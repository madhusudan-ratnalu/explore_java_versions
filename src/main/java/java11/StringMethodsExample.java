package java11;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";
        System.out.println("Is blank: " + str.isBlank());
        System.out.println("Stripped: '" + str.strip() + "'");
        System.out.println("Lines:");
        "Line1\nLine2\nLine3".lines().forEach(System.out::println);
        System.out.println("Repeated: " + "Java".repeat(3));
        System.out.println(("madhu").repeat(5));
    }

   /* New String Methods
    Java 11 added several new methods to the String class to improve its functionality.
    isBlank(): Returns true if the string is empty or contains only white space.
    lines(): Returns a stream of lines extracted from the string, separated by line terminators.
    strip(), stripLeading(), stripTrailing(): Strips white space from the string, with strip() being Unicode-aware.
    repeat(int n): Repeats the string n times.
    */
}