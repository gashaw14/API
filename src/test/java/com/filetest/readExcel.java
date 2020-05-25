package com.filetest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bastest.Basetest;

public class readExcel {
	
 Basetest test1;	
	
	
@Test
public ArrayList<String> ValidateFileformat(String testcase) throws IOException {
	
	ArrayList<String> a = new ArrayList<String>();
	
	FileInputStream input = new FileInputStream("C:\\Users\\Gashaw\\Desktop\\sample.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(input);
	
	 int sheets = wb.getNumberOfSheets();
	 for(int i=0; i < sheets; i++) {
		 if(wb.getSheetName(i).equalsIgnoreCase("testdata")) {
			 XSSFSheet sheet = wb.getSheetAt(i);
			Iterator<Row> rows = sheet.iterator();
			 Row firstrow = rows.next();
			Iterator<Cell> cell = firstrow.cellIterator();
			 int k=0;
			 int column =0;
			while(cell.hasNext()) {
				Cell value = cell.next();
				if(value.getStringCellValue().equalsIgnoreCase("tc")) {
					column = k;
				}
				 k++;
			}
			System.out.println(column);
			
			//scan entire identified coulumn
			while(rows.hasNext()) {
				Row row = rows.next();
				if(row.getCell(column).getStringCellValue().equalsIgnoreCase(testcase)) {
					Iterator<Cell> cv = row.cellIterator();
					while(cv.hasNext()) {
						Cell c = cv.next();
						if(c.getCellTypeEnum()== CellType.STRING) {
							String data = c.getStringCellValue();
							a.add(data);
						}
						else {
							
							a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						}
					
					
						
					}
				}
			}
		 }
		  
	 }
	return a;
}

@Test
public void ValidateTest() {
	System.out.println("hello");
}
@Test
public void ValidateTest2(){
	System.out.println("update for pull");
}
@Test
public void ValidateTest3() {
	System.out.println("test branch");
}
}
