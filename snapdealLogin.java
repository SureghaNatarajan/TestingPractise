package com.stepdefinitionfile;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.reusablefile.BrowserInvocation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class snapdealLogin {
		
		WebDriver driver;
	
	@Given("User navigates to snapdeal application")
	public void launchURL() {
		BrowserInvocation browser=new BrowserInvocation();
		driver =browser.BrowserInvocation();
	}
	
	@SuppressWarnings("deprecation")
	@Then("user clicks SignIn and hold")
	public void holdsignin() throws InterruptedException{
		//Clicks SignIn Button
		driver.findElement(By.xpath("//div[@class='accountInner']//span")).click();
		//Clicks Login Button
		driver.findElement(By.cssSelector(".accountBtn.btn.rippleWhite")).click();
		Thread.sleep(2000);
		WebElement frames= driver.findElement(By.id("loginIframe"));
		//Switching Window to Frame
		driver.switchTo().frame(frames);
		driver.findElement(By.xpath("//div[@class='userAuthIcons']//form[@id='commonView']//input[1]")).sendKeys("9677569832");
		driver.findElement(By.id("checkUser")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginUsingOtp")).click();

	}
	
	
		
	}
	
	
	
	
	
	

