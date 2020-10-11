package Qaclickacademy.mavenJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenWithMethodArray {
	
	public ArrayList<String> getData(String testcasename) throws IOException {
		ArrayList<String> a=new ArrayList<String>();
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
		            		                        if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
		            		                        {
		            		                        	Iterator<Cell>    cv         =r.cellIterator();
		            		                        	//to get the single values of the purchase do it as bellow:
		            		                        	while(cv.hasNext())
		            		                        	{
		            		                        		
		            		                        		
		            		                        		//System.out.println(cv.next().getStringCellValue()); //purchase and all the values
		            		                        		//to add in the arrayList
		            		                        		//a.add(cv.next().getStringCellValue());
		            		                        		//to convert it into string value
		            		                        		       Cell c     =cv.next();
		            		                        		       if(c.getCellTypeEnum()==CellType.STRING)
		            		                        		       {
		            		                        		     
		            		                        		    	   a.add(c.getStringCellValue());
			            		                        		       

		            		                        	}
		            		                        		       else
		            		                        		       {
		            		                        		    	   a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
		            		                        		    	   
		            		                        	
		            		                        	//using return statement
		            		                        	 
		            		                        }
		            		                        		       
		            		                        }
		            		                        	System.out.println(a); 

		            		                         }
		            	   }}
		               
		
		               }
					return a;
					
	}}

	
		
		            		                       
		            		                    	    
		            		                       
		            		                       
		            		                       
		            		                       
		            		                       
	
		            	             
		         
		                 
	    
		

	

	
