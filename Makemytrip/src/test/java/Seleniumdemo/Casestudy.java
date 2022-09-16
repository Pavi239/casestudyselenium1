package Seleniumdemo;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Casestudy {
	
	WebDriver driver;
	
	@BeforeTest
	public void BT() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
	}
	
	@Test
	public void testcase() throws InterruptedException
	{
		//CLICKING ON HOLIDAY PACKAGE//
		driver.findElement(By.linkText("Holiday Packages")).click();
		Thread.sleep(8000);
		//SELCTING FROM CITY//
		 driver.findElement(By.xpath("//*[@id='fromCity']")).click();
		 Thread.sleep(4000);
		// driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-1-item-2']/div/p/span")).click();
		 //driver.findElement(By.xpath("/body/div[@id='root']/di")).click();
		 //CLICKING BANGALORE//
		 driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-2']/div/p/span")).click();
		 
		 Thread.sleep(5000);
		 //HERE SENDING VALUE AS SINAGPORE
		 driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div/input")).sendKeys("Singapore");
		 Thread.sleep(3000);
		 //CLICKING ON SINGAPORE//
		 driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']/div/p")).click();
		 Thread.sleep(3000);
		 //CLICKING ON SEARCH BUTTON//
		 driver.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
		 Thread.sleep(5000);
		 //SELECTING DEPARTURE DATE//
		 driver.findElement(By.id("departure_date")).click();
		 Thread.sleep(3000);
		 //driver.findElement(By.xpath("//*[@id='modifySearchDetails']/div/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[4]/div[1]")).click();
		 //SELECTING THE DATE//
		 driver.findElement(By.xpath("//*[@id='modifySearchDetails']/div/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div[5]/div[6]")).click();
		 Thread.sleep(8000);
		 //CLICKING ON SEARCH//
		 driver.findElement(By.xpath("//*[@id='modifySearchDetails']/div/button")).click();
		 Thread.sleep(10000);
////		 JavascriptExecutor js = (JavascriptExecutor)driver;
////		 js.executeScript("document.getElementsByClassName('itemCard__ftr').[8].scrollIntoView()");
//		
//		//driver.findElement(By.xpath("//*[@class='makeFlex hrtlCenter']")).click();
//		//driver.findElement(By.xpath("//*[@id='root']/div/main/div[1]/div/div[12]/div/div[2]/div/div/div/div/div[3]/div/div/div/div[3]/div/div[1]/span")).click();
//		driver.findElement(By.xpath("//*[@class='destinationWrapper']")).click();
		 //selecting 2D/3N//scrolling to select 3d/2n//2TIMES SCROLLING//
		 driver.findElement(By.xpath("//*[@id='root']/div/main/div[1]/div/div[1]/div/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='root']/div/main/div[1]/div/div[1]/div/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		 //selecting 2d/3n//
		 driver.findElement(By.xpath("//*[@id='root']/div/main/div[1]/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[3]/div/div[1]/div/div/img")).click();
		 Thread.sleep(10000);
		 //switching to new tab//
		 ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newtab.get(1));
	      System.out.println("Page title of new tab: " + driver.getTitle());
	      Thread.sleep(10000);
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("window.scrollBy(0,800)");
	      //CHANGING THE HOTEL//
	     driver.findElement(By.xpath("(//*[@id='changeRemoveBtn']/span)[5]")).click();
	     Thread.sleep(10000);
	     //SCROLL TO SELECT THE HOEL//
	     js.executeScript("window.scrollBy(0,400)");
	     Thread.sleep(5000);
	     //SELECTING THE HOTEL ONE FARRER//
	     driver.findElement(By.xpath("//*[@id='modalpopup']/div/div/div/div/div[2]/div/div[5]/div[2]/div[7]/span")).click();
	     Thread.sleep(5000);
	     //UPDATING THE PACKAGE//
	   driver.findElement(By.xpath("//*[@id='modalpopup']/div/div/div/div/div[3]/div[2]/div")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("(//*[@id='chooseAndAddBtn'])[1]")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id='modalpopup']/div/div/div/div/div[2]/div/div[2]/div[2]/div[3]/span")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id='modalpopup']/div/div/div/div/div[4]/div[2]/div/p")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id='initeraryNav']/li[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='initeraryNav']/li[3]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='initeraryNav']/li[4]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='initeraryNav']/li[5]")).click();
		Thread.sleep(5000);
	   
			
	}
	
	@AfterTest
	public void AT() {
		driver.close();
	}

}
