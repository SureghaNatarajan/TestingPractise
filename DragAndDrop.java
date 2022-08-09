package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\apps\\Chrome 102\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frames = driver.findElement(By.className("demo-frame"));
		//Switch to Frames
		driver.switchTo().frame(frames);
		Actions action = new Actions(driver);
		//Create WEbElement for both Source and Target frames
		WebElement Draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Droppable = driver.findElement(By.id("droppable"));
		//Perform Drang and Drop using Action class with source and target frame
		action.dragAndDrop(Draggable, Droppable).build().perform();
		//Switch from Frame to Window
		driver.switchTo().defaultContent();
	}

}
