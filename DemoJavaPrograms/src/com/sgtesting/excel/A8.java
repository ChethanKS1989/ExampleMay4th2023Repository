package com.sgtesting.excel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A8 {
    public static void main(String[] args) {
        String inputFile = "G:\\Excel\\FN.xlsx"; // Input Excel file path
        String outputFile = "G:\\Excel\\LN.xlsx"; // Output Excel file path

        try (FileInputStream fis = new FileInputStream(inputFile);
             XSSFWorkbook workbook = new XSSFWorkbook(fis);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

            XSSFWorkbook outputWorkbook = new XSSFWorkbook();
            XSSFSheet outputSheet = outputWorkbook.createSheet("Sheet1"); // Creating a new sheet

            int rowNum = 0;
            for (Row row : sheet) {
                if (rowNum == 0) {
                    // Copying header row as is
                    Row headerRow = outputSheet.createRow(rowNum);
                    for (int i = 0; i < 5; i++) {
                        Cell cell = row.getCell(i);
                        Cell newCell = headerRow.createCell(i);
                        newCell.setCellValue(cell.getStringCellValue());
                    }
                } else {
                    // Copying data rows
                    Row dataRow = outputSheet.createRow(rowNum);
                    for (int i = 0; i < 5; i++) {
                        Cell cell = row.getCell(i);
                        Cell newDataCell = dataRow.createCell(i);
                        newDataCell.setCellValue(cell.getStringCellValue());
                    }
                }
                rowNum++;
            }

            outputWorkbook.write(fos);
            System.out.println("Data copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}