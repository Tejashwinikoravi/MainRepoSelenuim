package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base {

	public WebDriver driver;
	@Test
	public void two() throws IOException
	{
		driver=initializeDriver();
		 driver.get(prop.getProperty("url"));

		System.out.println("two test");
	}
}
