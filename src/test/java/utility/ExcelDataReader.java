package com.coforge.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

    XSSFWorkbook wb;

    public ExcelDataReader() {

        File src = new File("./TestData/TestData.xlsx");

        try {

            FileInputStream fis = new FileInputStream(src);

            wb = new XSSFWorkbook(fis);

        } catch (Exception e) {

            System.out.println("Unable to load Excel file: " + e.getMessage());

        }
    }

    // Read String data using sheet index
    public String getStringData(int sheetIndex, int row, int column) {

        return wb.getSheetAt(sheetIndex)
                 .getRow(row)
                 .getCell(column)
                 .getStringCellValue();
    }

    // Read String data using sheet name
    public String getStringData(String sheetName, int row, int column) {

        return wb.getSheet(sheetName)
                 .getRow(row)
                 .getCell(column)
                 .getStringCellValue();
    }

    // Read numeric data using sheet name
    public double getNumericData(String sheetName, int row, int column) {

        return wb.getSheet(sheetName)
                 .getRow(row)
                 .getCell(column)
                 .getNumericCellValue();
    }
}