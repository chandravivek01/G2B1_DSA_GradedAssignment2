package com.g2b1.dsa.service;

import com.g2b1.dsa.model.Node;

public class MNCTransactionService {

	static Node prevNode = null;
    static Node headNode = null;
	
	// Block to Transform Existing BST to Right-Skewed BST
    public static void convertToSkewedTree(Node node) {
		
		if(node==null)
			return;
		convertToSkewedTree(node.left);
		
		Node rightNode = node.right;
       
		// New Root/Head of the Right-Skewed Tree
        if(headNode == null) {
            
        	headNode = node;
        	
            // Making the Left Node of Root/Head point to NULL
            node.left = null;
            
            // Updating the Previous Node to the Root (First Element of Right-Skewed BST)
            prevNode = node;
        }
        
        else {
        	
        	// Linking the Nodes via Right Link progressively
            prevNode.right = node;
            
            // Making all the Left nodes point to NULL
            node.left = null;
            
            // Updating the Previous Node to the Current Node 
            prevNode = node;
        }
        
        // Checking for other smaller nodes of Right-Subtree 
        convertToSkewedTree(rightNode);
        
	}
	
	
	static void traverseRightSkewed(Node current) {
        if(current == null)
            return;
        
        // Displaying the Current Node of the Right-Skewed BST 
        System.out.print(current.data + " ");
        
        // Traversing progressively to the Right 
        traverseRightSkewed(current.right);       
    }


	public void transactionService(Node node) {
		
		convertToSkewedTree(node);
		
		System.out.println("\n\nModified Requirement (Right Skewed BST Transaction): ");
		traverseRightSkewed(headNode);
		
	}
	
	

}
