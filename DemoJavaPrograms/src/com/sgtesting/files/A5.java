package com.sgtesting.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A5 {
    public static void main(String[] args) {
        String filename = "G:\\f1.txt"; 
        
        try {
        	 FileReader readfile = new FileReader(filename);
             BufferedReader br = new BufferedReader(readfile);
        	// Read all lines from the file and store them in an array
            String[] lines = br.lines().toArray(String[]::new);
             
            int halfLength = lines.length / 2;
            
            // Read and print the first half of the content
            System.out.println("First half of the content:");
            for (int i = 0; i < halfLength; i++) {
                System.out.println(lines[i]);
            }
            
            System.out.println(); // Add a newline for separation
            
            // Read and print the second half of the content
            System.out.println("Second half of the content:");
            for (int i = halfLength; i < lines.length; i++) {
                System.out.println(lines[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}