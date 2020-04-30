package test.leap.year;

import org.junit.Assert;
import org.junit.Test;

import com.leap.year.LeapYear;

public class TestLeapYear {

	/**
	 * Test case to check 2002 is leap year or not, because not divisible by 400
	 */
	@Test
	public void testCase1(){
		
		boolean methodResult = LeapYear.checkLeapYear(2002);
		Assert.assertEquals(false, methodResult);
	}
	
	/**
	 * Test case to check 1700, 1800 and 1900(not divisible by 400) were not leap year 
	 * but 2100 is leap year(divisible by 400)
	 */
	@Test
	public void testCase2(){
		
		int yearList[] = { 1700, 1800, 1900, 2100 };
		boolean expectedResult[] = { false, false, false, false };
		for(int tc=0; tc < yearList.length; tc++){
			
			boolean methodResult = LeapYear.checkLeapYear(yearList[tc]);
			Assert.assertEquals(expectedResult[tc], methodResult);  
		}
	}
	
	/**
	 * Test case to check 2008, 2012 and 2016(divisible by 4) were leap year 
	 */
	@Test
	public void testCase3(){
		
		int yearList[] = { 2008, 2012, 2016 };
		boolean expectedResult[] = { true, true, true };
		for(int tc=0; tc < yearList.length; tc++){
			
			boolean methodResult = LeapYear.checkLeapYear(yearList[tc]);
			Assert.assertEquals(expectedResult[tc], methodResult);  
		}
	}
	
	/**
	 * Test case to check 2017, 2018 and 2019(not divisible by 4 and 400) were not leap year 
	 */
	@Test
	public void testCase4(){
		
		int yearList[] = { 2017, 2018, 2019 };
		boolean expectedResult[] = { false, false, false };
		for(int tc=0; tc < yearList.length; tc++){
			
			boolean methodResult = LeapYear.checkLeapYear(yearList[tc]);
			Assert.assertEquals(expectedResult[tc], methodResult);  
		}
	}
	
}
