package com.g2b1.dsa.service;

import java.util.Scanner;

public class FloorSizeInput {

	// Block to Accept Distinct Floor Sizes of the Building 
	public int[] getData() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of Floors in the building: ");
		int number =  scanner.nextInt();
		
		int[] arr = new int[number];
		int floorSize;
	
		for(int i=1;i<=number; i++) {	
			
			// Enter Distinct Floor Size Value 
			System.out.println("Enter the Floor Size given on Day: "+i);	
			floorSize = scanner.nextInt();
			arr[i-1] = floorSize;
			
		}
		
		scanner.close();
		return arr;
	}

}
