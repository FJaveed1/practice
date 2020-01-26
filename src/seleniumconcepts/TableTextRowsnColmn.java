package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableTextRowsnColmn {

	public static void main(String[] args) {
		
		String currDir = System.getProperty("user.dir");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		System.setProperty("webdriver.chrome.driver",currDir+"\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		//getting xpath of the table
		WebElement tbl= driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
		//getting the no of rows in a table.
		List<WebElement> tab_rows= tbl.findElements(By.tagName("tr"));
		//count of rows:
		int row_count= tab_rows.size();
		System.out.println("The number of Rows in this table are :" +row_count);
		System.out.println("---------------------------------------------");
		//loop will execute till the last row of the table
		for(int row=0;row<row_count;row++)
		{
			//getting the number of columns in each row
			List<WebElement> tab_columns=tab_rows.get(row).findElements(By.tagName("td"));
			int col_count= tab_columns.size();
			System.out.println("The number of cells in row "+row+ " are : " +col_count);
			//loop will execute till the last column of the table
			for(int colmn=0;colmn<col_count;colmn++)
			{
				String cell_text=tab_columns.get(colmn).getText();
				System.out.println("The cell value of row number"+ row+ " and the column number "+colmn+ " is " +cell_text);
			}
			System.out.println("**********************************************************************");
		}

	}

}
