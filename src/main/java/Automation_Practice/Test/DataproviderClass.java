package Automation_Practice.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataproviderClass {

	@DataProvider(name="Data1")
	public Object[][] logindata() {
		
		Object[][] data=new Object[4][2];
		
		data[0][0]="Zaker";
		data[0][1]="Pathan";
		
		data[1][0]="Sameer";
		data[1][1]="Khan";
		
		data[2][0]="Ra11";
		data[2][1]="Khan";
		
		data[3][0]="Rahil";
		data[3][1]="Khan";
		
		return data;
		
	}
	@DataProvider(name="Data2",parallel=true)
	public String[][] excelldata() throws Exception {
				
	File excellfile=new File("D:\\Eclipse_Selenuim_Program_folder1\\Test_Selenuim_Practice\\Data.xlsx");
		
	System.out.println(excellfile.exists());
		
     FileInputStream fis=new FileInputStream(excellfile);
     
     XSSFWorkbook workbook=new XSSFWorkbook(fis);
     
     XSSFSheet sheet=workbook.getSheet("Sheet1");
     
     int rownumber=sheet.getPhysicalNumberOfRows();
     
     System.out.println("rowCount/" +rownumber);
     
     int coloumnumber=sheet.getRow(0).getLastCellNum();
     
     String [][] data=new String[rownumber][coloumnumber];
     
     for (int i=0;i<rownumber-1;i++) {
    	 
    	 for(int j=0;j<coloumnumber;j++) {
    		 
    		 DataFormatter df=new DataFormatter();
    		 
    		 data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
    		 
    		 
    	 }
     }
     
     workbook.close();
     fis.close();
     return data;
	}

}


