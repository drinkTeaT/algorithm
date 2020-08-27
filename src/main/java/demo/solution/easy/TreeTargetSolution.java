package demo.solution.easy;

import demo.ISolution;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EDZ
 * @description 112. 路径总和
 * @date 2020/8/27 16:07
 */
public class TreeTargetSolution implements ISolution {
    private boolean flag = false;

    @Override
    public void solution() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(67);
        root.right.right = new TreeNode(0);


        System.out.println(hasPathSum(root, 20));
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        doFind(root, new ArrayList<>(), sum);
        return flag;
    }

    private void doFind(TreeNode node, List<Integer> list, int target) {
        if (flag) {
            return;
        }
        if (node == null) {
            int sum = 0;
            for (int i : list) {
                sum += i;
            }
            System.out.println(list);
            if (sum == target) {
                flag = true;
            }
            return;
        }
        list.add(node.val);
        doFind(node.left, list, target);
        list.remove(list.size() - 1);
        list.add(node.val);
        doFind(node.right, list, target);
        list.remove(list.size() - 1);
    }
}
