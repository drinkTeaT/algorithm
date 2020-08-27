package util;

import ds.Tree.BinaryTreeNode;
import graph.Graph;

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

    public static Graph generateGraph() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        return graph;
    }

    public static int[] buildHeap() {
        return new int[]{100, 90, 80, 30, 60, 50, 70, 20, 10, 40, 55, 45, 5};
    }

    public static int[] generateArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static TreeNode buildTreeNode(int[] nodes){
        TreeNode root = new TreeNode(nodes[0]);
        return root;
    }
}
