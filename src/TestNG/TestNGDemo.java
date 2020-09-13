package TestNG;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	@Before
	public void methodBefore(){
		
		System.out.println("Before test case");
	}
	
	@Test
public void methodA(){
	System.out.println("Inside the method A");
}
	@Test
public void methodAB(){
	System.out.println("Inside the method AB");
}
	@After
	public void afterMethod(){
		System.out.println("After Method");
	}
	
}
