package com.java.binaryTree;

import java.util.ArrayList;
import java.util.List;

class ParNode{
	
	int key;
	List<ParNode> nodes;
	
	ParNode(int value){
		key = value;
		nodes = null;
	}
}

public class TreeRepersentation {

	static ParNode root;
	
	TreeRepersentation() {
		root = null;
	}
	
TreeRepersentation(int val){
		root = new ParNode(val);
	}
	
	public static void main(String[] args) {
		TreeRepersentation tree = new TreeRepersentation();
		tree.root = new ParNode(1);
		List<ParNode> parNodeList = new ArrayList<ParNode>();
		parNodeList.add(new ParNode(2));
		parNodeList.add(new ParNode(3));
		tree.root.nodes = parNodeList;
		
		List<ParNode> nodesList = tree.root.nodes;
		
		int count = 0;
		for (ParNode parNode : nodesList) {
			List<ParNode> parNodeList1 = new ArrayList<ParNode>();
			if(count == 0){
				parNodeList1.add(new ParNode(4));
				parNodeList1.add(new ParNode(5));
			}
			else{
				parNodeList1.add(new ParNode(6));
				parNodeList1.add(new ParNode(7));
			}
			parNode.nodes = parNodeList1;
			count++;
		}
		
		System.out.println(" travarsal tree data  is: ");
		printData(root);
	}

	private static void printData(ParNode root2) {
		
			if (root2 == null)
				return;
			System.out.print(root2.key + " ");
			
			List<ParNode> nodesList = root2.nodes;
			if(nodesList != null){
				for (ParNode parNode : nodesList) {
					/*System.out.println(parNode.key);*/
					printData(parNode);
				}
			}
		/*}*/
		/*while(root2 != null){
			System.out.println(root2.key);
			List<ParNode> nodesList = root2.nodes;
			if(nodesList != null){
				for (ParNode parNode : nodesList) {
					System.out.println(parNode.key);
					root2 = parNode;
				}
			}
			
		}*/ 
		
	}


}
