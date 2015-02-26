package com.ritchie.order;

import com.ritchie.order.domain.TreeNode;

/**
 * 前序
 * @author yanziqi
 *
 */
public class PreOrderSort {

	/**
	 * 前序遍历
	 * @param rootNode
	 */
	public static void preOrder(TreeNode node) {
		System.out.print(node.getValue() + " ");
		if (node.getLeftNode() != null) {
			preOrder(node.getLeftNode());
		}
		if (node.getRightNode() != null) {
			preOrder(node.getRightNode());
		}
	}
}
