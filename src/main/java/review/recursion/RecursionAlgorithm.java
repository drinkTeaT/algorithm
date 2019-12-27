package review.recursion;

import ds.Tree.BinaryTreeNode;
import util.StaticUtil;

/**
 * Description 递归复习
 * 看做是小单位的集合，递归的方法为一个更小的单位
 * Author liuweibin
 * Date 2019/12/27 14:15
 **/
public class RecursionAlgorithm {
    /**
     * 斐波那契；与之前有关系的值直接用递归得到之前的值
     *
     * @param n
     * @return
     */
    public static long fibonacci(int n) {
        if (n <= 1) {
            return 0l;
        } else if (n == 2) {
            return 1l;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void treeRecursion() {
        BinaryTreeNode treeNode = StaticUtil.buildTree();
        recursion(treeNode);
    }

    public static void recursion(BinaryTreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        recursion(treeNode.getLeftNode());
        recursion(treeNode.getRightNode());
        System.out.println(treeNode.getValue());
    }

    /**
     * 打印第n层树深度的值
     *
     * @param n
     */
    public static void printDeepOfTreeValue(BinaryTreeNode treeNode, int n) {
        if (n <= 0 || treeNode == null) {
            return;
        }
        int k = n - 1;
        printDeepOfTreeValue(treeNode.getLeftNode(), k);
        printDeepOfTreeValue(treeNode.getRightNode(), k);
        if (n == 1) {
            System.out.println(treeNode.getValue());
        }
    }


    public static void main(String[] args) {
//        for (int i = 1; i < 20; i++) {
//            System.out.println(fibonacci(i));
//        }
        printDeepOfTreeValue(StaticUtil.buildTree(), 4);
//        treeRecursion();
    }
}
