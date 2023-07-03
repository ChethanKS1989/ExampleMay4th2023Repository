package com.sgtesting.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A4{
	public static void main(String[] args) {
		vegetablecontent();
	}
	private static void vegetablecontent()
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

			// Flower names
			String[] vegetables = {
	                "Carrot",
	                "Broccoli",
	                "Tomato",
	                "Potato",
	                "Spinach",
	                "Cabbage",
	                "Lettuce",
	                "Cauliflower",
	                "Bell pepper",
	                "Onion",
	                "Garlic",
	                "Zucchini",
	                "Mushroom",
	                "Eggplant",
	                "Pumpkin",
	                "Radish",
	                "Cucumber",
	                "Bean",
	                "Pea",
	                "Corn"
	        };

			for (int i = 0; i < vegetables.length; i++) {
	            row = sheet.createRow(i);
	           cell = row.createCell(4);
	            cell.setCellValue(vegetables[i]);
	        }
			fileOut = new FileOutputStream("G:\\Excel\\vegetables.xlsx");
			workbook.write(fileOut);
			System.out.println("Vegetable names written successfully to the Excel file.");
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
