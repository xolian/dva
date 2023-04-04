package com.servicenow.prodsec;
import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String args[]) throws Exception {
        char[] buffer = new char[1024];
        String filename = args[0];
        try {
            filename = "" + (Integer.parseInt(filename) % 3);
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
        new FileReader(filename).read(buffer);
        System.out.println(buffer);
        }
}
