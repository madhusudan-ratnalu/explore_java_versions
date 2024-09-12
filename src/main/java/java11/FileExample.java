package java11;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {
    public static void main(String[] args) throws Exception {
        Path path = Files.writeString(Files.createTempFile("example", ".txt"), "Java 11 features");
        String content = Files.readString(path);
        System.out.println("File content: " + content);
    }
  /*  6. New File Methods
    Java 11 added new methods to the java.nio.file.Files class.

    writeString(): Writes a string to a file.
    readString(): Reads the content of a file as a string.*/
}
