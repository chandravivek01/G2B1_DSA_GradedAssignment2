package com.g2b1.dsa.main;

import com.g2b1.dsa.model.BST;
import com.g2b1.dsa.model.Node;
import com.g2b1.dsa.service.MNCTransactionService;

//Driver Class for MNC Transaction
public class DriverMNCTransaction {
	
	public static void main(String[] args) {
		
		System.out.println("Initiate the Transactions for the MNC to be stored in a Normal BST: \n");
		
		BST bst = new BST();
		// Retrieving the Root of the Existing/Normal BST 
		Node root = bst.makeTransaction();
		
		MNCTransactionService mncTransactionService = new MNCTransactionService();
		// Transforming the Normal BST to Right-Skewed BST
		mncTransactionService.transactionService(root);
		
	}

}
