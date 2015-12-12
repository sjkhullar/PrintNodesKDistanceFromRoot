
package org.learn.Question;

import org.learn.PrepareTree.Node;

public class PrintNodesKDistFromRoot {

	public static void printNodesKDistFromRoot(Node root, int distance) {
		if(null == root) {
			return;
		}
		
		if(distance == 0) {
			System.out.printf(" %d ",root.data);
		} else if(distance > 0) {		
			printNodesKDistFromRoot(root.left, distance - 1);
			printNodesKDistFromRoot(root.right, distance - 1);
		}
		return;
	}	
}
