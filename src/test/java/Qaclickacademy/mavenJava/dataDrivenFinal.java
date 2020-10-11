package Qaclickacademy.mavenJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenFinal {

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
		            		       //access to specific rows-1st column
		            		                Row firstrow =rows.next();
		            		                
		            		             //access to specific column
		            		                int k=0;
		            		                int column = 0;
		            		                       Iterator<Cell> ce = firstrow.cellIterator();
		            		                       while(ce.hasNext())
		            		                       {
		            		                    	Cell value   =ce.next();
		            		                    	if(value.getStringCellValue().equalsIgnoreCase("testcases"))
		            		                    	{
		            		                    		column=k;
		            		                    	}
		            		                    	k++;
		            		                       }
		            		                       System.out.println(column); //0
		            		                       //access to purcahse value
		            		                         while(rows.hasNext())
		            		                         {
		            		                        Row r	= rows.next();
		            		                        if(r.getCell(column).getStringCellValue().equalsIgnoreCase("purchase"))
		            		                        {
		            		                        	Iterator<Cell>    cv         =r.cellIterator();
		            		                        	//to get the single values of the purchase do it as bellow:
		            		                        	while(cv.hasNext())
		            		                        	{
		            		                        		System.out.println(cv.next().getStringCellValue()); //purchase and all the values
		            		                        	}
		            		                        }
		            		                         }
		            		                       
		            		                    	    
		            		                       
		            		                       
		            		                       
		            		                       
		            		                       
		            		                       
		            		                       
		            		                       
		            		       
		            	   }
		            	             
		               }
		                 
	}}    
		

	

	
