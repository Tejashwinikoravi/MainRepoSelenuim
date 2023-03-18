package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class FourTest extends Base {

public WebDriver driver;
@Test
public void FourTest() throws IOException
{
	
	System.out.println("code got updated into selenuim");

	System.out.println("code got updated by naveen");
	System.out.println("code got updated by Ramya");
	 driver=initializeDriver();
	 
	System.out.println("Four test got executed");
	 driver.get(prop.getProperty("url"));

	Assert.assertTrue(false);
}
}
