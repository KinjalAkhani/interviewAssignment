package com.leap.year;

import java.util.Scanner;

/**
 * Leap year program to check for multiple year enter by user is leap year or not
 * @author Kinjal Akhani
 *
 */
public class CheckMultipleYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("********** Java Multiple Leap Year Check Program ***********");
		
		Scanner scanner = null;
		try{
			
			System.out.print("Please enter number of years you want to check ::-> ");
			scanner = new Scanner(System.in);
			
			int noOfYear = scanner.nextInt();
			
			boolean yearListChk[] = new boolean[noOfYear];
			int yearToCheck[] = new int[noOfYear];
			
			System.out.println("Please enter years separated by space you want to check ::-> ");
			for(int ind=0; ind<noOfYear; ind++){
				yearToCheck[ind] = scanner.nextInt();
				yearListChk[ind] = LeapYear.checkLeapYear(yearToCheck[ind]);
			}
			
			for(int ind=0; ind<noOfYear; ind++){
				if(yearListChk[ind]){
					
					System.out.println("Yeah!! The entered year "+yearToCheck[ind]+" is leap year, you can plan for extra day - 29th Feb...");
					
				}
				else{
					
					System.out.println("The entered year "+yearToCheck[ind]+" is not a leap year...");
				}
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
