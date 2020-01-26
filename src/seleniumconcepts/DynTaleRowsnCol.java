package seleniumconcepts;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Basic.dynTableColnRows;

public class DynTaleRowsnCol {

		

		public static void main(String[] args) 
		{
			String currDir = System.getProperty("user.dir");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			System.setProperty("webdriver.chrome.driver",currDir+"\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver(options);
			//driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/web-table-element.php");
			
			List<WebElement> col= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
			System.out.println("The no of Columns in a table are : "+col.size());
			
			List<WebElement> rows= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]/a"));
			System.out.println("The no of Rows in a table are : "+rows.size());
		
		
			

			
			/*columns:
				//*[@id="leftcontainer"]/table/thead/tr/th[1]
				//*[@id="leftcontainer"]/table/thead/tr/th[2]
				//*[@id="leftcontainer"]/table/thead/tr/th[3]
				//*[@id="leftcontainer"]/table/thead/tr/th[5]
				
				
				Rows:
					//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
			//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
			//*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]/a
			//*[@id="leftcontainer"]/table/tbody/tr[26]/td[1]/a
					//*[@id="leftcontainer"]/table/tbody/tr[26]/td[1]/a*/
		}

		/html/body/table
		//*[@id="leftcontainer"]/table
		/html/body/div/div[3]/div[1]/table

	}


