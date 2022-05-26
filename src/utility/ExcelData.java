package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
   int count;	
   public  String TestSheetPath = "D://SELENIUM FRAMEWORK//Selenium_learning//src//TestData//config.xlsx";
   Workbook book;
   Sheet sheet;
   
   
 
	 
	
	public Object[][] exlData(String SheetName,String execute,String process) throws InvalidFormatException
	{
		
		ExcelData ed = new ExcelData();
		
		Object data [][] = ed.getTestData(SheetName,execute,process);
		Object data1 [][] = new Object  [ed.count][data.length];
		//System.out.println(data.length);
		
		for(int i=0; i<ed.count;i++)
		{
			for(int j=0;j<data.length;j++)
			{
				//System.out.println(data [i][j]);
				 data1 [i][j]=data [i][j];
				
			}
		}
		
    return data1;
	}
	
	
   

    public  Object [][]getTestData(String SheetName,String execute,String process) throws InvalidFormatException
    {     
    	    int x=0;
    	    int y=0;
    	   count=0;
    	Object[][] data;
    	
    	
    	FileInputStream file = null;
    	
    	try{
    		
    	file = new FileInputStream(TestSheetPath);
    		
    	}catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    	}
   
       try{
    	   book = WorkbookFactory.create(file);
        }catch(IOException e)
    	{
  		e.printStackTrace();
     	}
       sheet = book.getSheet(SheetName);
       
        data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        
       for(int i=0; i<sheet.getLastRowNum(); i++)
       {    y=0;
    	   
    	   for(int k=0; k<sheet.getRow(0).getLastCellNum(); k++) 
    	   {
    		   
    		   //System.out.println(sheet.getLastRowNum()+"-----"+sheet.getRow(0).getLastCellNum());
    		   if((sheet.getRow(i+1).getCell(k).toString().equalsIgnoreCase(execute)) 
    				   && (sheet.getRow(i+1).getCell(k+1).toString().equalsIgnoreCase(process) ))
    		   {   
    			   count++;
    			   int ro = sheet.getRow(i+1).getRowNum();
    			   int cl = sheet.getRow(i+1).getLastCellNum();
    			  // System.out.println(ro);
    			 //  System.out.println(cl);
    			   for(int m = ro;m<=ro;m++)
    			   {    
    				   for(int n = 0;n<cl;n++)
    				   { 
    		         data[x][y]=sheet.getRow(m).getCell(n).toString();
    		        // System.out.println(data[x][y]);   
    		              y++;
    		        
    		         
    		       
    				   }x++;
    			   }
    		   }
    	   }//System.out.println("Count is : "+count);
    	   
       }
       return data;
       
    }


}
