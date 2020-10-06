package com.shoaib.selenium;

/*
 * 
 * @Author- Shoaib Hannure
 * 
 */

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
//@BeforeSuite----Set Up System Property for Chrome---I
//@BeforeTest----Launch Browser---II
//@BeforeClass----Login to the app---III
	
//@BeforeMethod----Enter URL
//@Test----Google Title Test
//@AfterMethod----logout from the App
	
//@BeforeMethod----Enter URL
//@Test----Google Title Test
//@AfterMethod----logout from the App
	
//@BeforeMethod----Enter URL
//@Test----Search Test
//@AfterMethod----logout from the App
	
//@AfterClass----Close Browser
//@afterTest----delete all cookies


	// Pre-Conditions annotations-- Starting with @Before
	@BeforeSuite // 1
	public void setUp() {
		System.out.println("@BeforeSuite----Set Up System Property for Chrome");
	}

	@BeforeTest // 2
	public void launchBrowser() {
		System.out.println("@BeforeTest----Launch Browser");
	}

	@BeforeClass // 3
	public void login() {
		System.out.println("@BeforeClass----Login to the app");
	}

	/*
	 * @BeforeMethod
	 * 
	 * @Test-1
	 * 
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * 
	 * @Test-2
	 * 
	 * @AfterMethod
	 */

	@BeforeMethod // 4
	public void enterURL() {
		System.out.println("@BeforeMethod----Enter URL");
	}

	// Test Cases--Starting with @Test
	@Test // 5
	public void googleTitleTest() {
		System.out.println("@Test----Google Title Test");
	}

	@Test
	public void searchTest() {
		System.out.println("@Test----Search Test");
	}

	@Test
	public void googleLogoTest() {
		System.out.println("@Test----Google Title Test");
	}

	// post conditions -- starting with @After
	@AfterMethod // 6
	public void logout() {
		System.out.println("@AfterMethod----logout from the App");
	}

	@AfterClass // 7
	public void closeBrowser() {
		System.out.println("@AfterClass----Close Browaer");
	}

	@AfterTest // 8
	public void deleteallcookies() {
		System.out.println("@afterTest----delete all cookies");
	}

	// @AfterSuite // 9
	// public void generateTestReport() {
	// System.out.println("Generate Test Report");
	// }

}
