package books.sword;

import util.TreeNode;

import java.util.HashMap;

/**
 * Description 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重
 * 建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不
 * 含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序
 * 遍历序列{4,7,2,1,5,3,8,6}，则重建出图2.6所示的二叉树并输出
 * 它的头结点
 * leetcode 从前序与中序遍历序列构造二叉树 中等
 * Author liuweibin
 * Date 2020/1/14 14:49
 **/
public class S4_RebuildTree {

}

class Solution {
    // start from first preorder element
    int pre_idx = 0;
    int[] preorder;
    int[] inorder;
    HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

    public TreeNode helper(int in_left, int in_right) {
        // if there is no elements to construct subtrees
        if (in_left == in_right)
            return null;

        // pick up pre_idx element as a root
        int root_val = preorder[pre_idx];
        TreeNode root = new TreeNode(root_val);

        // root splits inorder list
        // into left and right subtrees
        int index = idx_map.get(root_val);

        // recursion
        pre_idx++;
        // build left subtree
        root.left = helper(in_left, index);
        // build right subtree
        root.right = helper(index + 1, in_right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;

        // build a hashmap value -> its index
        int idx = 0;
        for (Integer val : inorder)
            idx_map.put(val, idx++);
        return helper(0, inorder.length);
    }
}