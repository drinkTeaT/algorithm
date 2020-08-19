package algo.base;

import ds.Tree.BinaryTreeNode;

/**
 * 递归：
 * <p>
 * 1 可以用树的形式展示流程；
 * 2 触底是返回条件的时候，这个时候可进行左右返回的数据处理。假如触底返回1时，相加表示有多少种方案触底。
 * 3 用递归推算出公式，可以用数组加for循环解决
 * <p>
 * 应用：
 * <p>
 * 1 判断是否满足进栈的条件；
 * 2 递归进栈；
 * 3 当满足出栈条件时，返回上层的“递归”方法下一行。
 * <p>
 * 疑惑：
 * 1 递归能不能对中途节点的值进行判断?还是只能返回触底返回设置的值?
 * 2 多个子递归不能在中途判断，有没有一种可能就是在中途判断但是是走递归的形式呢？实现疑惑1的效果，不要求是递归。
 * 3 单链表变成多链递归模型
 * </p>
 * <p>
 * 疑惑解答：
 * 1，不能在中途返回值即不能return，不然递归不起作用。对要修改值的，可以用包装类型 参考：DeCodeWaySolution
 * 2，动态规划吧，顺着递归图并收集结果的解法。参考StringToDoubleString
 * 3，用两个递归组合，参考StringToDoubleString
 * </p>
 * @author EDZ
 */
public class RecursiveThinking {
    /**
     * n的阶乘即 n!
     * 例如数值是4：进栈过程-> 4,3,2；
     */
    public int multiplyNumber(int n) {
        // 进栈条件
        if (n != 1) {
            // 进栈过程 4,3,2
            int product = multiplyNumber(n - 1);
            // 上层递归方法的下一行
            return product * n;
        }
        // 触底开始出栈
        return 1;
    }

    /**
     * 著名的菲波拉契(Fibonacci)数列，其第一项为0，第二项为1，从第三项开始，其每一项都是前两项的和。编程求出该数列前N项数据。
     */
    public long fibonacci(int n) {
        // 进栈
        if (n > 2) {
            long value = fibonacci(n - 1);
            long result = value + fibonacci(n - 2);
            return result;
        }
        // 触底反弹
        return 1L;
    }

    /**
     * 打印出深度为n的所有值
     */
    public void deapValue(BinaryTreeNode root, int n) {
        // 满足进栈条件
        if (root != null && n != 1) {
            // 左侧递归
            deapValue(root.getLeftNode(), n - 1);
            deapValue(root.getRightNode(), n - 1);
        } else {
            if (root != null && n == 1) {
                // 出栈
                System.out.println(root.getValue());
            }
        }
    }
}
