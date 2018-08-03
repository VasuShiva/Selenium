package com.vasu.method;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadTest
{

	public static void main(String[] args) throws Exception
	{
		File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rwcnt=ws.getLastRowNum();
		for (int i = 0; i <=rwcnt; i++) 
		{
			String data=ws.getRow(i).getCell(0).getStringCellValue();
			String data1=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data+"----"+data1);
		}
		
		/*String data=ws.getRow(0).getCell(0).getStringCellValue();
		String data1=ws.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data+"----"+data1);*/
	}

}
