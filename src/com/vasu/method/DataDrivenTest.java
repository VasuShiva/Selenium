package com.vasu.method;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws Exception
	{
		RegistrationTest app=new RegistrationTest();
		
File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rwcnt=ws.getLastRowNum();
		for (int i = 1; i <=rwcnt+1; i++) 
		{
			String fName=ws.getRow(i).getCell(0).getStringCellValue();
			String lName=ws.getRow(i).getCell(1).getStringCellValue();
			String userName=ws.getRow(i).getCell(2).getStringCellValue();
			String password=ws.getRow(i).getCell(3).getStringCellValue();
			String cpassword=ws.getRow(i).getCell(4).getStringCellValue();
			String results=app.reg(fName, lName, userName, password, cpassword);
			
			ws.getRow(i).createCell(5).setCellValue(results);
			
			FileOutputStream fos=new FileOutputStream(src);
			
			wb.write(fos);
			
					
		}
		
		
		wb.close();

	}

}
