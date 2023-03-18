package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class ThreeTest extends Base
{
	public WebDriver driver;
	
@Test
public void threeTest() throws IOException
{
	driver=initializeDriver();
	 driver.get(prop.getProperty("url"));
 
	System.out.println("three test got executed");
}
}