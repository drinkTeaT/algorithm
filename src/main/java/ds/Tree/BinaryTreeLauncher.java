package ds.Tree;

public class BinaryTreeLauncher {
    public static void main(String[] args) {
        // 创建节点
        TreeNode root = new BinaryTreeNode(40);
        TreeNode<BinaryTreeNode> leftNode = new BinaryTreeNode(20);
        TreeNode<BinaryTreeNode> rightNode = new BinaryTreeNode(60);
        TreeNode<BinaryTreeNode> leftNode1 = new BinaryTreeNode(30);
        TreeNode<BinaryTreeNode> rightNode1 = new BinaryTreeNode(50);
        TreeNode<BinaryTreeNode> leftNode2 = new BinaryTreeNode(39);
        TreeNode<BinaryTreeNode> rightNode2 = new BinaryTreeNode(54);
        // 插入节点
        root.insertNode(leftNode, root);
        root.insertNode(leftNode1, root);
        root.insertNode(leftNode2, root);
        root.insertNode(rightNode, root);
        root.insertNode(rightNode1, root);
        root.insertNode(rightNode2, root);
    }
}
