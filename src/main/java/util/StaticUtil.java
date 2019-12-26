package util;

import ds.Tree.BinaryTreeNode;

public class StaticUtil {

    public static BinaryTreeNode buildTree() {
        BinaryTreeNode root = new BinaryTreeNode(40);
        BinaryTreeNode leftNode = new BinaryTreeNode(20);
        BinaryTreeNode rightNode = new BinaryTreeNode(60);
        BinaryTreeNode leftNode1 = new BinaryTreeNode(30);
        BinaryTreeNode rightNode1 = new BinaryTreeNode(50);
        BinaryTreeNode leftNode2 = new BinaryTreeNode(39);
        BinaryTreeNode rightNode2 = new BinaryTreeNode(54);
        // 插入结点
        root.insertNode(leftNode, root);
        root.insertNode(leftNode1, root);
        root.insertNode(leftNode2, root);
        root.insertNode(rightNode, root);
        root.insertNode(rightNode1, root);
        root.insertNode(rightNode2, root);
        return root;
    }

    public static int[] buildHeap() {
        return new int[]{100, 90, 80, 30, 60, 50, 70, 20, 10, 40, 55, 45, 5};
    }
}
