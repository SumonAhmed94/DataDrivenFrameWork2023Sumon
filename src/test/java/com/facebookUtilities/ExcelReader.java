package com.facebookUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	/*
	 * Workbook name registration
	 * Sheet name = Sheet 1, Sheet,2, Sheet,3
	 * In Java Row start with 0
	 * Column start with 0
	 * 	Cell = intersection of row and column
	 * Faruk=registration.xlsx= Sheet1=Row=1=column String=Cell 
	 * Index start from 0
	 * row start from 0
	 * column start from 0
	 * row always come first
	 */

	
	public String filepath;
	public String sheetname;
	public ExcelReader(String filepath, String sheetname) {
		super();
		this.filepath = filepath;
		this.sheetname = sheetname;
		 
	}
	
public String getStringCellValue(int rowNum, int columnNum) {
	String celldata=null; //is called flag
	try {
		FileInputStream fis=new FileInputStream(filepath);//(filepath) name is processed variable
		Workbook registrationbook=new XSSFWorkbook(fis);// XSSF is an interface, 
		Sheet sheet=registrationbook.getSheet(sheetname);
		Row row=sheet.getRow(rowNum);
		Cell column= row.getCell(columnNum);
		celldata=column.getStringCellValue();
		System.out.println(celldata);
		registrationbook.close();
		fis.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return celldata;
	
}
public double getNumericCellValue(int rowNum, int columnNum) {
	double celldata=0.0; //is called flag
	try {
		FileInputStream fis=new FileInputStream(filepath);//(filepath) name is processed variable
		Workbook registrationbook=new XSSFWorkbook(fis);// XSSF is an interface, 
		Sheet sheet=registrationbook.getSheet(sheetname);
		Row row=sheet.getRow(rowNum);
		Cell column=row.getCell(columnNum);
		celldata=column.getNumericCellValue();
		System.out.println(celldata);
		registrationbook.close();
		fis.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return celldata;
}
	public static void main(String[] args) {
	String file="src/test/resources/registration.xlsx";
		ExcelReader er=new ExcelReader(file, "Sheet1");
		er.getStringCellValue(0, 1);
		er.getStringCellValue(0, 2);
		er.getStringCellValue(0, 3);
		er.getStringCellValue(1, 1);
		er.getStringCellValue(1, 2);
		ExcelReader er1=new ExcelReader(file, "Sheet3");
		er1.getNumericCellValue(1, 0);
		er1.getNumericCellValue(0, 2);	

}
}