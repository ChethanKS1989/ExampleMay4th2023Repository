package com.sgtesting.files;
import java.io.File;

public class A4 {

	public static void main(String[] args) {
		 

		        String parentFolder = "G:\\Four";



		        File rootFolder = new File(parentFolder);

		        if (rootFolder.exists() && rootFolder.isDirectory()) {

		            readFoldersRecursively(rootFolder);

		            readFoldersRecursively1(rootFolder);

		            readFoldersRecursively3(rootFolder);

		            readFoldersRecursively4(rootFolder);

		        } else {

		            System.out.println("Invalid folder path: " + parentFolder);

		        }

		    }

		    

		    ///read the path of excel file



		    private static void readFoldersRecursively(File folder) {

		        File[] files = folder.listFiles();

		        if (files != null) {

		            for (File file : files) {

		                if (file.isDirectory()) {

		                    readFoldersRecursively(file);

		                } else {

		                    String fileName = file.getName();

		                    if (fileName.endsWith(".xlsx") || fileName.endsWith(".xls")) {

		                        System.out.println("Excel File: " + file.getAbsolutePath());

		                    }

		                }

		            }

		        }

		    }

		    

		    //display file names of word doc



		    private static void readFoldersRecursively1(File folder) {

		        File[] files = folder.listFiles();

		        if (files != null) {

		            for (File file : files) {

		                if (file.isDirectory()) {

		                    readFoldersRecursively1(file);

		                } else {

		                    String fileName = file.getName();

		                    if (fileName.endsWith(".doc") || fileName.endsWith(".docx")) {

		                        System.out.println("Word Document File: " + file.getAbsolutePath());

		                    }

		                }

		            }

		        }

		    }

		    //rename all txt files



		    private static void readFoldersRecursively3(File folder) {

		        File[] files = folder.listFiles();

		        if (files != null) {

		            for (File file : files) {

		                if (file.isDirectory()) {

		                    readFoldersRecursively3(file);

		                } else {

		                    String fileName = file.getName();

		                    if (fileName.endsWith(".txt")) {

		                        String newFileName = fileName.replace(".txt", ".renamed.txt");

		                        File newFile = new File(file.getParentFile(), newFileName);

		                        boolean renamed = file.renameTo(newFile);

		                        if (renamed) {

		                            System.out.println("Text File renamed: " + newFile.getAbsolutePath());

		                        } else {

		                            System.out.println("Failed to rename Text File: " + file.getAbsolutePath());

		                        }

		                    }

		                }

		            }

		        }

		    }

		    //delete all renamed txt files



		    private static void readFoldersRecursively4(File folder) {

		        File[] files = folder.listFiles();

		        if (files != null) {

		            for (File file : files) {

		                if (file.isDirectory()) {

		                    readFoldersRecursively4(file);

		                } else {

		                    String fileName = file.getName();

		                    if (fileName.endsWith(".renamed.txt")) {

		                        boolean deleted = file.delete();

		                        if (deleted) {

		                            System.out.println("Text File deleted: " + file.getAbsolutePath());

		                        } else {

		                            System.out.println("Failed to delete Text File: " + file.getAbsolutePath());

		                        }

		                    }

		                }

		            }

		        }

		    }

		}



