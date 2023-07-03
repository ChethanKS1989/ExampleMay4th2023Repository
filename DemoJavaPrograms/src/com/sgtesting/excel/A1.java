package com.sgtesting.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1{
	public static void main(String[] args) {
		fruitcontent();
	}
	private static void fruitcontent()
	{
		FileOutputStream fileOut=null;
		Workbook workbook=null;
		Sheet sheet=null;
		Row row=null;
		Cell cell=null;
		try
		{

			// Create a new workbook
			workbook = new XSSFWorkbook();

			// Create a new sheet
			sheet = workbook.createSheet("Sheet1");

			// Fruit names
			String[] fruits = {
					"Apple", "Banana", "Orange", "Mango", "Strawberry",
					"Pineapple", "Grapes", "Watermelon", "Cherry", "Kiwi",
					"Pear", "Peach", "Plum", "Lemon", "Coconut",
					"Blueberry", "Raspberry", "Blackberry", "Pomegranate", "Avocado"
			};

			// Write fruit names to the first column
			for (int i = 0; i < fruits.length; i++) {
				String fruit = fruits[i];
				 row = sheet.createRow(i);
				 cell = row.createCell(0);
				cell.setCellValue(fruit);
			}
			fileOut = new FileOutputStream("G:\\Excel\\fruits.xlsx");
			workbook.write(fileOut);
			System.out.println("Fruit names written successfully to the Excel file.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			// Close the workbook
			try 
			{
				fileOut.close();
				workbook.close();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}