package start;

import java.util.Arrays;

public class MainStringArgs {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(Arrays.toString(args));
        String zahlstr = args[0];
        int zahl = Integer.parseInt(zahlstr);
        System.out.println(zahlstr + 1);
        System.out.println(zahl + 1);
        String zahladd = zahlstr + 1;
        System.out.println(zahladd);
        String zahltostring = Integer.toString(zahl);
        Integer zahlzwei = 5;
        // Integer zahldrei = new Integer(5); deprecated! DONT USE

        // Wrapper Classes
        // Character Double Float Integer Long Boolean Short Byte
    }
}
