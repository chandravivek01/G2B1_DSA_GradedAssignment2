package com.g2b1.dsa.main;

import com.g2b1.dsa.service.ConstructionOrderDisplay;
import com.g2b1.dsa.service.FloorSizeInput;

// Driver Class for the Building Construction
public class DriverBuilding {

	public static void main(String[] args) {
	
		FloorSizeInput floorSizeInput = new FloorSizeInput();
		// Storing the Floor Sizes into an Array
		int[] arr = floorSizeInput.getData();
		
		ConstructionOrderDisplay constructionOrderDisplay = new ConstructionOrderDisplay();
		// Analyzing the Status of Construction
		constructionOrderDisplay.display(arr);
	}
}
