package utility;

import java.io.IOException;

public class CheckExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelApiTest eat = new ExcelApiTest("D://SELENIUM FRAMEWORK//Selenium_learning//testdata//config.xlsx");
int colCount = eat.getCellCount("Login");

System.out.println(+colCount);

int rowCount = eat.getRowCount("Login");
System.out.println(+rowCount);


System.out.println(eat.getCellData("Login", "role", 4));
	}

}
