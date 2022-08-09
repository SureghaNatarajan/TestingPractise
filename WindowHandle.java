package rahulshetty;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\apps\\Chrome 102\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> ite=windows.iterator();
		String parentwindow = ite.next();
		String childwindow = ite.next();
		driver.switchTo().window(childwindow);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.quit();
		
		
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector(".blinkingText")).click();
//		Set<String> windows =driver.getWindowHandles();
//		Iterator<String> it= windows.iterator();
//		String parentId = it.next();
//
//		String childId = it.next();
//		driver.switchTo().window(childId);
//		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
//		String Emailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//		driver.switchTo().window(parentId);
//
//		driver.findElement(By.id("username")).sendKeys(Emailid);
	}

}
