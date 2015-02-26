package com.ritchie.order;

import com.ritchie.order.domain.TreeNode;

public class OrderApp {
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(8);
		TreeNode n9 = new TreeNode(9);

		n1.setLeftNode(n2);
		n1.setRightNode(n3);
		n2.setLeftNode(n4);
		n2.setRightNode(n5);
		n3.setLeftNode(n6);
		n3.setRightNode(n7);
		n5.setLeftNode(n8);
		n5.setRightNode(n9);
		System.out.println("前序遍历：");
		PreOrderSort.preOrder(n1);
		System.out.println("\n后序遍历：");
		PostOrderSort.postOrder(n1);
		System.out.println("\n中序遍历：");
		InOrderSort.inOrder(n1);
	}
}
