package algo.base;

/**
 * 递归：
 * <p>
 * 1 可以用树的形式展示流程；
 * 2 本质是进栈，出栈。
 * <p>
 * 应用：
 * <p>
 * 1 每个树节点就是一个栈中的值；
 * 2 递归进栈；
 * 3 return 出栈并可对栈数据进行操作。
 */
public class RecursiveThinking {
    /**
     * n的阶乘即 n!
     * 例如数值是4：进栈过程-> 4,3,2；
     */
    public int multiplyNumber(int n) {
        if (n != 1) {
            // 进栈过程 4,3,2
            int product = multiplyNumber(n - 1);
            return product * n;// 开始出栈 2,3,4
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
        return 1l;
    }
}
