package assignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {
	
	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\TestData.xlsx";
		
		File src = new File(path);
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		DataFormatter df = new DataFormatter();
		
		String value = df.formatCellValue(sh1.getRow(4).getCell(1));
		
		System.out.println(value);
	}	
}
