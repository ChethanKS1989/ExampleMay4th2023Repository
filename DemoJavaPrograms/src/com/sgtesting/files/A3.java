package com.sgtesting.files;

import java.io.File;

public class A3 {
    public static void main(String[] args) {
        String directoryPath = "G:\\Demo1"; 
        
        File directory = new File(directoryPath);
        
        if (!directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }
        
        readDirectories(directory);
    }
    
    private static void readDirectories(File directory) {
        File[] files = directory.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getAbsolutePath());
                    readDirectories(file); // Recursive call to read subdirectories
                }
            }
        }
    }
}


