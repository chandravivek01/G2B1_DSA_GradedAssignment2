package com.g2b1.dsa.service;

import java.util.Collections;
import java.util.PriorityQueue;

public class ConstructionOrderDisplay {

	boolean status=false;
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

	
	// Block to Analyze the Construction Process 
	public void display(int[] arr) {
		
		int number = arr.length;
		
		// Maximum Floor Size that needs to be laid consecutively
		int max = number;
		
		System.out.println("\nThe Order of Construction is as follows \n");
		
		for(int i=1; i<=number; i++) {
		
			System.out.println("Day: " + i);
			
			// Analyzing the Status of Nth Day	
			queue.add(arr[i-1]);
			while(!queue.isEmpty()) {
				
				if(max==queue.peek()) {
					
					// Displaying for an Affirmative Status
					System.out.print(max+ " ");
					
					// Updating the Maximum Expected Floor Size to be Stacked to its Next Lower Level Floor
					max--;
					
					/* Removing the Floor Size (whose foundations are laid on the Building) from the Queue, 
					   to accommodate the next Higher Level Floor */
					queue.remove();
				}
				
				// Breaking to move on to next Day's Work Status 
				else
					break;
			}
			System.out.println();
		}
	}

}
