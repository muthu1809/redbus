package com.selenium.util;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingUtil {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	/*This method is to set the File path and to open the Excel file, Pass
	Excel Path and Sheetname as Arguments to this method
	*/
	public static void setExcelFile(String Path, String SheetName) throws Exception {

		try {

			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Get the required Sheet in the selected Excel file

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e) {

			System.out.println("Please check file is present or not");
			throw (e);

		}

	}

	// Below method is for reading test data from the Excel cell, in this we are
	// passing parameters as RowNum and ColNum

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			String CellData = Cell.getStringCellValue();

			return CellData;

		} catch (Exception e) {

			System.out.println("Please check file is present or not");
			throw (e);

		}

	}

	/*This method is to write in the Excel cell, Parameters here are: RowNum,ColNum */

	public static void setCellData(String Result, int rowNum, int colNum) throws Exception {

		try {

			Row = ExcelWSheet.getRow(rowNum);

			Cell = Row.getCell(colNum, Row.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(colNum);

				Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

			// Constant variables Test Data file path and Test Data file name

			FileOutputStream fileOut = new FileOutputStream(Constant.filePath + Constant.fileName);

			ExcelWBook.write(fileOut);

			fileOut.flush();

			fileOut.close();

		} catch (Exception e) {

			throw (e);

		}

	}

}