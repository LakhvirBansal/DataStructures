package com.java.src;

import java.util.ArrayList;
import java.util.List;

/*class Node{
	String val;
	List<Node> childNodes;
	
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public List<Node> getChildNodes() {
		return childNodes;
	}
	public void setChildNodes(List<Node> childNodes) {
		this.childNodes = childNodes;
	}
	
	
}*/

public class TreeData {
	 private Node root;

	    public TreeData(String rootData) {
	        root = new Node();
	        root.data = rootData;
	        root.children = new ArrayList<Node>();
	    }

	    public static class Node {
	        private String data;
	        private Node parent;
	        private List<Node> children;
	    }

	public static void main(String[] args) {
		
	
	}
}
