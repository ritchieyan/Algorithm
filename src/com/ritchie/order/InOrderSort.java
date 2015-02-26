package com.ritchie.order;

import com.ritchie.order.domain.TreeNode;

/**
 * 中序
 * @author yanziqi
 *
 */
public class InOrderSort {

	/**
	 * 中序遍历
	 * @param node
	 */
	public static void inOrder(TreeNode node) {
		if (node.getLeftNode() != null) {
			inOrder(node.getLeftNode());
		}
		System.out.print(node.getValue() + " ");
		if (node.getRightNode() != null) {
			inOrder(node.getRightNode());
		}
	}

}
