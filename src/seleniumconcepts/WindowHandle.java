package seleniumconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {

	public static void main(String[] args) {

		String currentDir=System.getProperty("user.dir");

		ChromeOptions opt= new ChromeOptions(); 
		opt.addArguments("start-maximized");
		//System.out.println("The current directory is : "+currentDir);
		System.setProperty("webdriver.chrome.driver","D:\\Ramesh\\Selenium\\Selenium_test\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("http://demo.guru99.com/popup.php");

		driver.findElement(By.xpath("/html/body/p/a")).click();
		//getting the window handle for the parent session
		String parentWindow=driver.getWindowHandle();

		System.out.println("The main window session is :"+parentWindow);
		//getting the other opened windows
		Set<String> winHandles=driver.getWindowHandles();
		//int count_hanlde=winHandles.size();
		System.out.println("The window hanles are: "+winHandles);
		Iterator<String> it=winHandles.iterator();

		while(it.hasNext())
		{
			String childWindow=it.next();
			if(!parentWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println("Switching to the child window");
				System.out.println("The child Window session is : "+childWindow);
				driver.findElement(By.name("emailid")).sendKeys("Fouzia");
				driver.findElement(By.name("btnLogin")).click();
				System.out.println("Closing the child Window...");
				driver.close();

			}

		}
		driver.switchTo().window(parentWindow);
		System.out.println("Switched back to parent window");
	}

}
