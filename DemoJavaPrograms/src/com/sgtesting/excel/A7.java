package com.sgtesting.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class A7{
	public static void main(String[] args) {
		flowercolorcontent();
	}
	private static void flowercolorcontent()
	{
		FileInputStream fileIn=null;
		FileOutputStream fileOut=null;
		Workbook workbook=null;
		Row row=null;
		Cell cell=null;
		String filePath = "G:\\Excel\\fc.xlsx";
		try  
		{
			fileIn = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fileIn);

			// Get the first sheet
			Sheet sheet1 = workbook.getSheetAt(0);

			// Get the flower names from the first column of the first sheet
			int rowCount = sheet1.getLastRowNum() + 1;
			String[] flowerNames = new String[rowCount];
			for (int i = 0; i < rowCount; i++) {
				row = sheet1.getRow(i);
				cell = row.getCell(0);
				flowerNames[i] = cell.getStringCellValue();
			}

			// Get the color names from the second  column of the first sheet
			int rowCount1 = sheet1.getLastRowNum() + 1;
			String[] colorNames = new String[rowCount];
			for (int i = 0; i < rowCount1; i++) {
				row = sheet1.getRow(i);
				cell = row.getCell(1);
				colorNames[i] = cell.getStringCellValue();
			}
			// Create the second sheet
			Sheet sheet2 = workbook.createSheet("Sheet2");

			// Write the flower names  to the 7th row of the second sheet

			row = sheet2.createRow(6);
			for (int i =0  ; i<rowCount; i++) {
				String flowerName = flowerNames[i];
				cell = row.createCell(i);
				cell.setCellValue(flowerName);
			}
			// Write the color name names  to the 8th row of the second sheet
			row = sheet2.createRow(7);
			for (int i =0  ; i<rowCount1; i++) {
				String colorname = colorNames[i];
				cell = row.createCell(i);
				cell.setCellValue(colorname);
			}
			fileOut=new FileOutputStream(filePath);
			workbook.write(fileOut);
			System.out.println("Data written to sheet2 successfully!");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{


			try  {
				fileIn.close();
				fileOut.close();
				workbook.close();
			}


			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
