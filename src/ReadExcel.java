
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import jxl.read.biff.BiffException;

//How to read excel files using Apache POI
public class ReadExcel {
	public static void main (String [] args) throws IOException{
                        //I have placed an excel file 'Test.xlsx' in my D Driver 
			FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\Demo Scenario for Frmaework.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("sheet1");
                        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
			
////			
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(1);
			
			//String cellValue = cell.getDateCellValue().toString();
			
			

		//String name=System.out.println(cell);
		
			
			if(cell.equals("Otsuka Support Q1 2019")) {
				System.out.println(cell);
				
			}
           
			
	}		
}



