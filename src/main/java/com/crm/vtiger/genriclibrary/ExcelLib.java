package com.crm.vtiger.genriclibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib implements IConstantLib {

	/**
	 * To read data from excel
	 * @param SheetName
	 * @param RowNumber
	 * @param CellNumber
	 * @return
	 * @throws Throwable
	 */
	public String getDataFromExcel(String SheetName , int RowNumber , int CellNumber) throws Throwable {
		
		FileInputStream fis = new FileInputStream(EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row rn = sh.getRow(RowNumber);
		Cell cn = rn.getCell(CellNumber);
		String value = cn.getStringCellValue();
		wb.close();
		return value;
	}
	
	/**
	 * To write data on excel
	 * @param SheetName
	 * @param RowNumber
	 * @param CellNumber
	 * @param Data
	 * @throws Throwable
	 */
	
	public void writeDataToExcel(String SheetName , int RowNumber , int CellNumber , String Data) throws Throwable {
		FileInputStream fis = new FileInputStream(EXCELPATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(SheetName);
		Row rn = sh.getRow(RowNumber);
		Cell cn = rn.getCell(CellNumber);
		cn.setCellValue(Data);
		
		FileOutputStream fos = new FileOutputStream(EXCELPATH);
		wb.write(fos);
		wb.close();
	}

}


