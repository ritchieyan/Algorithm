package com.ritchie.order.domain;

/**
 * 二叉树模型定义
 * @author yanziqi
 *
 */
public class TreeNode {
	private Integer value;
	private TreeNode leftNode;
	private TreeNode rightNode;

	public TreeNode(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	@Override
	public String toString() {
		return "TreeNode [value=" + value + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
	}

}
