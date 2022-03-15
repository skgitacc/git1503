
package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium\\Chrome97\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement options = driver.findElement(By.id("Skills"));
		
		Select data = new Select(options);
		//select an index---------------
		data.selectByIndex(9);
		//selct using txtvalue---------------
		// data.selectByVisibleText("CSS");
		//size of skill container------------
//		List<WebElement> skillcont = driver.findElements(By.id("Skills"));
//		int size2 = skillcont.size();
//		System.out.pri ntln(size2);	
		//size of whole options-------------	
		List<WebElement> skillsall = data.getOptions();
		int size = skillsall.size();
		System.out.println(size);
		
		//print exact index to find exact txtvalue---------		
//		WebElement oneskill = skillsall.get(5);
//		String text = oneskill.getText();
//		System.out.println(text);
		//forloop - iterate the options in dropdown----------
//		for (int i = 1; i <10; i++) {
//			WebElement optall = skillsall.get(i);
//			String text2 = optall.getText();
//			System.out.println(text2);
		//}
		//enhanced forloop - complete iteration
		for (WebElement x : skillsall) {
			String text3 = x.getText();
			System.out.println(text3);
		}
		
		for (WebElement y : skillsall) {
			String att = y.getAttribute("Value");
			System.out.println(att);
	}	
	}
}
