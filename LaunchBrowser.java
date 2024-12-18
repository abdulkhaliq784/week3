package week3day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		
	 ChromeDriver driver= new ChromeDriver();
	
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.partialLinkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 
	 String title1 = driver.getTitle();
	 System.out.println("title1");
	 
	 driver.findElement(By.linkText("Create Lead")).click();
	 
	   // driver.findElement(By.tagName("a")).click();
	  // to print the all links
	 
	 //List <WebElement> var = driver.findElements(By.tagName("a"));
	    // for(int i = 0; i<var.size();i++) {
	    	// String text = var.get(i).getText();
				//System.out.println(text);
	     //}
	     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abdul");
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Khaliq");
	     
	     WebElement source = 
	     driver.findElement(By.id("createLeadForm_dataSourceId"));
	     
	   Select obj = new Select (source);
	   obj.selectByIndex(2);
	   obj.selectByVisibleText("Employee");
	   Thread.sleep(3000);
	   obj.selectByValue("LEAD_DIRECTMAIL");
	   
	   driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("testleaf project");
	   
	   WebElement Ownership =
	   driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	   Select obj1 = new Select (Ownership);
	   obj1.selectByIndex(3);
	   
	   WebElement Industry = 
       driver.findElement(By.id("createLeadForm_industryEnumId"));
	   Select obj2 = new Select (Industry);
	   obj2.selectByIndex(4);
	   
       driver.findElement(By.name("submitButton")).click();
       String title2 = driver.getTitle();
       System.out.println("title2");

	   
	   
	       

	}
}
