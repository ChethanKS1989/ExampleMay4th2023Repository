package com.sgtesting.files;

import java.io.File;

public class A1 {

	public static void main(String[] args) {
		

	        String parentFolder = "G:\\Demo\\Test\\Assignment1";

	        int numberOfFolders = 10;



	        for (int i = 1; i <= numberOfFolders; i++) {

	            String folderName = "Folder" + i;

	            String folderPath = parentFolder + "/" + folderName;



	            File folder = new File(folderPath);



	            if (!folder.exists()) {

	                boolean created = folder.mkdirs();

	                if (created) {

	                    System.out.println("Folder created: " + folderPath);

	                } else {

	                    System.out.println("Failed to create folder: " + folderPath);

	                }

	            } else {

	                System.out.println("Folder already exists: " + folderPath);

	            }

	        }

	    }

	}

