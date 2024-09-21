package com.crm.vtiger.CreateContact;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetExcelData {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("./TestData/Address.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String billadd = wb.getSheet("Address").getRow(1).getCell(0).getStringCellValue();
		String billbox = wb.getSheet("Address").getRow(1).getCell(1).getStringCellValue();
		String billcity = wb.getSheet("Address").getRow(1).getCell(2).getStringCellValue();
		String billstate = wb.getSheet("Address").getRow(1).getCell(3).getStringCellValue();
		String billcode = wb.getSheet("Address").getRow(1).getCell(4).getStringCellValue();
		String billcountry = wb.getSheet("Address").getRow(1).getCell(5).getStringCellValue();
		System.out.println(billadd + ""+ billbox + "" + "" + billcity + "" + billstate + "" + billcode +"" + billcountry);
	}

}
