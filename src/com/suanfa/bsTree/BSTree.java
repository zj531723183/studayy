package com.suanfa.bsTree;

public class BSTree<T extends Comparable<T>> {
	private BSTNode<T> mRoot; // �����

	public class BSTNode<T extends Comparable<T>> {
		T key; // �ؼ���(��ֵ)
		BSTNode<T> left; // ����
		BSTNode<T> right; // �Һ���
		BSTNode<T> parent; // �����

		public BSTNode(T key, BSTNode<T> parent, BSTNode<T> left, BSTNode<T> right) {
			this.key = key;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}
	}
}
