package Ex_01_JavaBasics.Ex58_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex58_03_ExceptionHandlingTHROWS {
    public static void main(String[] args) throws FileNotFoundException {

        // Checked Exception -- JVM knows how to handle the Checked exception,
        // So it will give you option to Handle it by throws keyword.
        // throws keyword always add in the main function.
        FileInputStream FileInput = new FileInputStream("C://Program/value.txt");
    }

}
