package com.sgtesting.files;

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;



public class A8 {

	public static void main(String[] args) {

		String sourceFilePath1 = "G:\\A1.txt";

		String sourceFilePath2 = "G:\\A2.txt";

		String targetFilePath = "G:\\A3.txt";



		 try (BufferedReader reader1 = new BufferedReader(new FileReader(sourceFilePath1));

	             BufferedReader reader2 = new BufferedReader(new FileReader(sourceFilePath2));

	             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFilePath))) {
			String line;



			// Read and write the contents from the first source file

			while ((line = reader1.readLine()) != null) {

				writer.write(line);

				writer.newLine();

			}



			// Read and write the contents from the second source file

			while ((line = reader2.readLine()) != null) {

				writer.write(line);

				writer.newLine();

			}
			



			System.out.println("Contents from both files have been written to the target file.");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}



