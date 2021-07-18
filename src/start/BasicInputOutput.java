package start;

import java.io.IOException;

public class BasicInputOutput {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        System.err.println("Hello stderr");
        int zahl = System.in.read();
        zahl = System.in.read();
        System.out.println(((char) zahl));
    }
}
