package ds.Tree;


/**
 * 普通二叉树
 */
public class BinaryTreeNode implements TreeNode<BinaryTreeNode> {
    private int value;
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    @Override
    public int countDeap() {
        return 0;
    }

    @Override
    public void delNode() {

    }

    @Override
    public void insertNode(BinaryTreeNode newNode, BinaryTreeNode root) {
        // 新节点值大于本节点放在右边
        if (newNode.getValue() > root.getValue()) {
            if (root.getRightNode() == null) {
                root.setRightNode(newNode);
                return;
            }
            root = root.getRightNode();
            insertNode(newNode, root);
        } else {
            if (root.getLeftNode() == null) {
                root.setLeftNode(newNode);
                return;
            }
            root = root.getLeftNode();
            insertNode(newNode, root);
        }
    }

    @Override
    public void midIterator(BinaryTreeNode root) {
        
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
