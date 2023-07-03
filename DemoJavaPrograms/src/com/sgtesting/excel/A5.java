package com.sgtesting.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class A5{
	public static void main(String[] args) {
		citycontent();
	}
	private static void citycontent()
	{
		FileInputStream fileIn=null;
		FileOutputStream fileOut=null;
		Workbook workbook=null;
		Row row=null;
		Cell cell=null;
		String filePath = "G:\\Excel\\cityname.xlsx";
		try  
		{
			 fileIn = new FileInputStream(filePath);
             workbook = new XSSFWorkbook(fileIn);

            // Get the first sheet
            Sheet sheet1 = workbook.getSheetAt(0);

            // Get the fruit names from the first column of the first sheet
            int rowCount = sheet1.getLastRowNum() + 1;
            String[] cityNames = new String[rowCount];
            for (int i = 0; i < rowCount; i++) {
                 row = sheet1.getRow(i);
               cell = row.getCell(0);
               cityNames[i] = cell.getStringCellValue();
            }

            // Create the second sheet
            Sheet sheet2 = workbook.createSheet("Sheet2");

            // Write the city names to the fifth row of the second sheet
            row = sheet2.createRow(4);
			for (int i =0  ; i<rowCount; i++) {
				String cityName = cityNames[i];
				cell = row.createCell(i);
				cell.setCellValue(cityName);
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
	