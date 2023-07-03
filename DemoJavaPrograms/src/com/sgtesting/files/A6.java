package com.sgtesting.files;

import java.io.File;
//import java.io.IOException;

public class A6 {
    public static void main(String[] args) {
        // Specify the directory path where the files are located
        String directoryPath = "G:\\four";
        
        // Create an array to store the file names of word documents
        String[] wordDocuments = new String[5];
        
        // Create an array to store the file names of excel files
        String[] excelFiles = new String[5];
        
        // Create an array to store the file objects of text files
        File[] textFiles = new File[5];
        
        // Read the path of only Excel files and display the filenames of word documents
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        
        if (files != null) {
            int wordCount = 0;
            int excelCount = 0;
            
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    
                    if (fileName.endsWith(".xlsx") || fileName.endsWith(".xls")) {
                        // Excel file
                        excelFiles[excelCount] = fileName;
                        excelCount++;
                    } else if (fileName.endsWith(".docx") || fileName.endsWith(".doc")) {
                        // Word document
                        wordDocuments[wordCount] = fileName;
                        wordCount++;
                    } else if (fileName.endsWith(".txt")) {
                        // Text file
                        textFiles[wordCount] = file;
                    }
                }
            }
            
            // Rename all text files
            for (File textFile : textFiles) {
                if (textFile != null) {
                    String newName = "new_" + textFile.getName();
                    File newFile = new File(textFile.getParent(), newName);
                    textFile.renameTo(newFile);
                }
            }
            
            // Delete all available text files
            for (File textFile : textFiles) {
                if (textFile != null) {
                    try {
                        textFile.delete();
                    } catch (SecurityException e) {
                        System.out.println("Unable to delete file: " + textFile.getName());
                    }
                }
            }
            
            // Display the filenames of word documents
            for (String wordDocument : wordDocuments) {
                if (wordDocument != null) {
                    System.out.println(wordDocument);
                }
            }
        }
    }
}
