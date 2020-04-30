package com.leap.year;

import java.util.Scanner;

/**
 * Leap year program to check single year enter by user is leap year or not
 * @author Kinjal Akhani
 *
 */
public class LeapYear {

	/**
	 * Static method to check whether the year given by user is leap year or not
	 * @param year
	 * @return boolean
	 */
	public static boolean checkLeapYear(int year){
		
		/**
		 * Test case - 1 : if given year is divisible by 400 or 4 then return true
		 */
		if(year % 400 == 0 || year % 4 == 0){
			return true;
		}
		/**
		 * Test case - 1 : if given year is divisible by 100 then return false
		 */
		if(year % 100 == 0){
			return false;
		}
		
		return false;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("********** Java Leap Year Program ***********");
		
		Scanner scanner = null;
		try{
			
			System.out.print("Please enter year you want to check ::-> ");
			scanner = new Scanner(System.in);
			
			int year = scanner.nextInt();
			
			boolean isLeapYear = checkLeapYear(year);
			
			if(isLeapYear){
				
				System.out.println("Yeah!! The entered year "+year+" is leap year, you can plan for extra day - 29th Feb...");
				
			}
			else{
				
				System.out.println("The entered year "+year+" is not a leap year...");
			}
			
		}
		catch(Exception e){
			System.out.println("Ohh !! Sorry there is some issue with the system please try again letter...");
		}
		finally{
			if(scanner != null){
				scanner.close();
			}
		}
	}

}
