package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


            String x = " Hello ".repeat(4);
// 1. New String methods ... repeat()
            System.out.println(x);
            String c = new String();
            if (" ".isBlank() & c.isBlank())
// isBlank() ... checks if string is blank
            {
                System.out.println("Empty Strings");
            }
            c = " How are things    ";
// Giving c a value to see strip() being used
            System.out.println(c.length());
            c = c.strip();
// strip() ... removes heading & trailing whitespace
            System.out.println(c);
            System.out.println(c.length());
            x = "Hello \n y'all! \n";
            Stream a = x.lines();
            System.out.println(a.count());
            var y = "5";
// 2. Introduction of var but only at local level
            y = y + y; // Adding two strings together
            System.out.println(y);
            add(4);

// 3. Files static methods readString and writeString ... simpler I/O
            Path file = Path.of("values.txt");
            String s = null;
            try {
                s = Files.readString(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(s);

            String msg = "\nYes it is?";

            try {// writeString
                Files.writeString(file, msg, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Messing with lambdas here ... not N.B.
            test u = (n, d) -> n * d;
            int b = u.methodA(4, 5);
            System.out.println(b);

        } // End of main

        static void add(int a) {
            var b = 'v'; // Localised var
            System.out.println(b);
        }

    } // End of class


    interface test {

        int methodA(int a, int b);

    }

