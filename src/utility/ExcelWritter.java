package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritter {
	
	public void writedata() throws IOException 
	{
        String path = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		File src = new File(path);
		
	// Loading the Excel Sheet	
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
//		XSSFSheet sh1 = wb.getSheet("sheet1");            // use of name of sheet as a string,this method will be used
		XSSFSheet sh1 = wb.getSheetAt(0);                 // use of index position of sheet,this method will be used 
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);

// write on existing row and existing column		
		sh1.getRow(7).getCell(0).setCellValue("ABC");
		
// write on new row and new column		
		sh1.createRow(31).createCell(5).setCellValue("mrf");
		
// write on existing row and new column		
		sh1.getRow(1).createCell(4).setCellValue("nds");
		
		wb.write(fos);
	
	}


	
	
	
	
	




	
	public static void main(String[] args) throws IOException 	
	{
		String path = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		File src = new File(path);
		
	// Loading the Excel Sheet	
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
//		XSSFSheet sh1 = wb.getSheet("sheet1");            // use of name of sheet as a string,this method will be used
		XSSFSheet sh1 = wb.getSheetAt(0);                 // use of index position of sheet,this method will be used 
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		sh1.getRow(7).getCell(0).setCellValue("ABC");
		sh1.createRow(31).createCell(5).setCellValue("mrf");
		sh1.getRow(1).createCell(4).setCellValue("nds");
		
		wb.write(fos);
	
	}
}
