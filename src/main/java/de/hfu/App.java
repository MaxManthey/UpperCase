package de.hfu;

import java.io.*;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )  throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter String: ");
        String str = br.readLine();  // Read user input

        System.out.println(str.toUpperCase());
    }
}
