package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllRowAndColumnData {
public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		File src = new File(path);
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		int rowcount = sh1.getLastRowNum()+1;
		System.out.println("Total no. of row count are : "+rowcount);
		
		int columncount = sh1.getRow(0).getLastCellNum();
		System.out.println("Total no. of column count are : "+columncount);
		
		DataFormatter df = new DataFormatter();
		
		for(int row=0;row<rowcount;row++)
		{
			for(int column=0;column<columncount;column++) 
			{
				String value = df.formatCellValue(sh1.getRow(row).getCell(column));
				
				System.out.print(value+" ");
				
			}
			System.out.println();

		}
		
		
		
	}
}
