package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.batik.apps.rasterizer.Main;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name="testdata")
	public static String [][] dpTest() throws IOException {
		
String path = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		File src = new File(path);
		
	// Loading the Excel Sheet	
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("sheet2");                                 // use of name of sheet as a string,this method will be used
//		XSSFSheet sh1 = wb.getSheetAt(0);                                     // use of index position of sheet,this method will be used 
		
		
//	 	To read the only string value from the excel sheet
		
//		String value = sh1.getRow(4).getCell(1).getStringCellValue();	
//		System.out.println(value);
		
		int rowcount = sh1.getLastRowNum()+1;
		System.out.println("Total no of row "+rowcount);
		
		int columncount = sh1.getRow(0).getLastCellNum();
		System.out.println("Total no of column "+columncount);
		
//		DataFormatter df = new DataFormatter();                                        // Use only this method for all types data
		
		String [][] data = new String[rowcount][columncount];
		
		for(int i=0; i<rowcount; i++) 
		{
			for(int j=0; j<columncount; j++) 
			{
			data[i][j]=sh1.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
		
//		String value = df.formatCellValue(sh1.getRow(row).getCell(column));
				
	}
	
	public static void main(String[] args) throws IOException {
		
		dpTest();
	}
}
