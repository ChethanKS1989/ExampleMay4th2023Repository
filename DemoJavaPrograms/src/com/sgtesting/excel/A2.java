package com.sgtesting.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A2{
	public static void main(String[] args) {
		flowercontent();
	}
	private static void flowercontent()
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
			String[] flowers = {
	                "Rose", "Lily", "Tulip", "Sunflower", "Daisy",
	                "Orchid", "Carnation", "Daffodil", "Peony", "Hyacinth",
	                "Marigold", "Hibiscus", "Lotus", "Poppy", "Chrysanthemum",
	                "Dahlia", "Columbine", "Iris", "Lavender", "Jasmine"
	            };

			 row = sheet.createRow(9); // Tenth row (index 9)
            
            // Write flower names to the cells in the tenth row
            for (int i = 0; i < flowers.length; i++) {
                 cell = row.createCell(i);
                cell.setCellValue(flowers[i]);
            }
			fileOut = new FileOutputStream("G:\\Excel\\flowers.xlsx");
			workbook.write(fileOut);
			System.out.println("Flower names written successfully to the Excel file.");
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
