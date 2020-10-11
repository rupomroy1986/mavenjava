package Qaclickacademy.mavenJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//access to the sheet
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\resources\\Excel.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		               int sheets=workbook.getNumberOfSheets();
		               System.out.println(sheets);
		               for(int i=0;i<sheets;i++)
		               {
		            	   if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
		            	   {
		            		XSSFSheet sheet=workbook.getSheetAt(i);
		            		//access to all the rows
		            		       Iterator<Row> rows= sheet.iterator();
		            		       //to print allthe values from the excel sheet
		            		                while(rows.hasNext())
		            		                {
		            		                Row r	=rows.next();
		            		                
		            		                Iterator<Cell> ce=r.cellIterator();
		            		                while(ce.hasNext())
	            		                       {
	            		                    	System.out.println(ce.next().getStringCellValue());
	            		                       }
		            		                
		            		                
		            		                }
		            		            

		            		                
		            		                
		            		                    		              
		            		                    	}
		            		                       }
		            		                       
		            		       
		            	   }
		            	             
		               }
		                 
		                      
		

	

	
