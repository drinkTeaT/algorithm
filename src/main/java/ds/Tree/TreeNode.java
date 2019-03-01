package ds.Tree;

public interface TreeNode<T> {
    /** 计算深度*/
    public int countDeap();

    /** 删除节点*/
    public void delNode();

    /** 插入节点*/
    public void insertNode(T newNode,T root);

    /** 递归中序遍历*/
    public void midIterator(T root);
}
