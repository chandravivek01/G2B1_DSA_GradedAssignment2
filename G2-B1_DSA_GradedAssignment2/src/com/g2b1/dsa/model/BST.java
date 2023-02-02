package com.g2b1.dsa.model;

import java.util.Scanner;


// Block to build-up the Transaction Tree  in a BST 
public class BST {
	
		static Node root = null;
		
		
		// Insertion in a BST
		static Node insert(Node root, int key) {
		
				// When the BST is Empty, Making Root Point to the First Node
				if(root==null)
					return new Node(key);
			
				if(key<root.data)
					root.left = insert(root.left, key);
			
				if(key>root.data)
					root.right = insert(root.right, key);
				
				return root;
		}
		
		// Block to Store Transaction Amount in a BST
		public Node makeTransaction() {
			Scanner scanner = new Scanner(System.in);
			int choice = 1;
			int transactionNumber=1;
			int amount;
			do {
				
				System.out.println("Enter Amount(Integer Value) for the Transaction " + transactionNumber + ": ");
				amount = scanner.nextInt();
				
				//Storing the First Transaction Amount to the BST
				if(root==null)
					root = insert(root, amount);
				
				else
					insert(root, amount);
				
				System.out.println("Do you want to make further transaction: (1 -> Yes) |  (0 -> No) : "
					+ "Enter '1' Or '0': ");
				choice = scanner.nextInt();
				transactionNumber++;
				
			}while(choice==1);
			
			System.out.println("Existing MNC Transaction Tree (BST with Left Nodes, Inorder Traversal): ");
			inOrder(root);
			
			scanner.close();
			return root;
		}

		// Displaying the BST (In-order Traversal)
		public static void inOrder(Node root) {
				
			if(root==null)
				return;
			
			inOrder(root.left);
			System.out.print(root.data+ " ");
			inOrder(root.right);
				
		}
			
}
