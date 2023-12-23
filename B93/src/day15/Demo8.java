package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/B93%20Selenium/Workspace/pages/sample4.html");

		List<WebElement> allTB = driver.findElements(By.tagName("input"));
		int count=allTB.size();
		System.out.println(count);//2
		
//		WebElement tb1 = allTB.get(0);
//		tb1.sendKeys("hi");
//		
//		WebElement tb2=allTB.get(1);
//		tb2.sendKeys("hi");
		
		for(int i=0;i<=count;i++)
		{
			WebElement tb=allTB.get(i);//IndexOutOfBoundsException
			tb.sendKeys("hi");
		}
		

	}

}
