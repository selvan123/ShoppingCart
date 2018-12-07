package devops.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {

	public static WebDriver driver;
	
	@BeforeSuite
	public static void setup(){
	//System.setProperty("webdriver.chrome.driver", "D:\\Users\\maudas\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	//driver=new ChromeDriver();
		driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//driver.get("https://s3-us-west-2.amazonaws.com/java-demo-bucket/elb-dns.txt");
	//String url=driver.findElement(By.xpath("//body")).getText();
	driver.get("https://shoppingcart-app.azurewebsites.net/shoppingcart/");
}
	@Test
	public static void test1(){
		
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("ShopIeasy")){
			System.out.println("Site is loaded properly");
		}
		else{
			System.out.println("Site is not loaded properly");
		}
	}
	
	@Test
	
	public static void test2(){
		
		driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
		String aboutus=driver.findElement(By.xpath("//div[@id='para']/p")).getText();
		System.out.println("More information about ShopIeasy ");
		System.out.println(aboutus);
		
	}
	
	
}
