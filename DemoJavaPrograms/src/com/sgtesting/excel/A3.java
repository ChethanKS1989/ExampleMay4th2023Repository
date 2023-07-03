package com.sgtesting.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A3{
	public static void main(String[] args) {
		countrycontent();
	}
	private static void countrycontent()
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


			String[] countryNames = {
					"Country 1", "Country 2", "Country 3", "Country 4", "Country 5",
					"Country 6", "Country 7", "Country 8", "Country 9", "Country 10",
					"Country 11", "Country 12", "Country 13", "Country 14", "Country 15",
					"Country 16", "Country 17", "Country 18", "Country 19", "Country 20"
			};

			// Write country names diagonally
			for (int i = 0; i < countryNames.length; i++) {
				row = sheet.createRow(i);
				cell = row.createCell(i);
				cell.setCellValue(countryNames[i]);
			}
			fileOut = new FileOutputStream("G:\\Excel\\countries.xlsx");
			workbook.write(fileOut);
			System.out.println("Country names written successfully to the Excel file.");
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
