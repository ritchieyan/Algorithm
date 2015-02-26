package com.ritchie.order;

import com.ritchie.order.domain.TreeNode;

/**
 * 后序
 * @author yanziqi
 *
 */
public class PostOrderSort {

	/**
	 * 后序遍历
	 * @param node
	 */
	public static void postOrder(TreeNode node) {
		if (node.getLeftNode() != null) {
			postOrder(node.getLeftNode());
		}
		if (node.getRightNode() != null) {
			postOrder(node.getRightNode());
		}
		System.out.print(node.getValue() + " ");
	}
}
