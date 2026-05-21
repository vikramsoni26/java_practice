package Exceptation_In_Java;

import java.io.FileReader;
import java.io.IOException;

public class compiletimeexception {
    public static void main(String[] args)  throws IOException {
        FileReader fr = new FileReader("text");
    }
}
