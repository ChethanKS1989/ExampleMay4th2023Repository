package com.sgtesting.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A7 {
    public static void main(String[] args) {
        String inputFile = "G:\\f1.txt";
        String outputFile = "G:\\F2.txt";

        try {
            // Read input file and store content in an array
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String[] lines = new String[10];
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                lines[index++] = line;
            }
            reader.close();

            // Write content to output file in reverse order
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (int i = index - 1; i >= 0; i--) {
                writer.write(lines[i]);
                writer.newLine();
            }
            writer.close();

            System.out.println("Content reversed and written to " + outputFile + " successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}