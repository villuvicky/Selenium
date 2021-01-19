package com.testNG.selenium;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_POI {

		public static void main(String[] args) throws IOException {
	        String excelFilePath = "C:\\Users\\villu\\Documents\\TestData_JXL.xls";
	        FileInputStream inputStream = new FileInputStream(excelFilePath);
	        Workbook workbook = new HSSFWorkbook(inputStream);
	        Sheet firstSheet = workbook.getSheetAt(0);
	        Iterator<Row> iterator = firstSheet.iterator();
	         
	        while (iterator.hasNext()) {
	            Row nextRow = iterator.next();
	            Iterator<Cell> cellIterator = nextRow.cellIterator();
	             
	            while (cellIterator.hasNext()) {
	                Cell cell = cellIterator.next();
	                
	                switch (cell.getCellType()) {
	                    case STRING:
	                    	
	                        System.out.print(cell.getStringCellValue()+"\t");
	                        break;
	                    case BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue()+"\t");
	                        break;
	                    case NUMERIC:
	                        System.out.print(cell.getNumericCellValue()+"\t");
	                        double num= cell.getNumericCellValue();
	                        NumberToTextConverter.toText(num);
	                        break;
	                }
	                
	            }
	            System.out.println();
	        }
	         
	        workbook.close();
	        inputStream.close();
	    
	 
	}
	}

