package algo.base;

/**
 * 递归
 */
public class Recursive {
    /**
     * n的阶乘即 n!
     */
    public int multiplyNumber(int n) {
        if (n == 1) {
            return n;
        }
        int product = multiplyNumber(n - 1);
        return n * product;
    }

    /**
     * 著名的菲波拉契(Fibonacci)数列，其第一项为0，第二项为1，从第三项开始，其每一项都是前两项的和。编程求出该数列前N项数据。
     */
    public long fibonacci(int n) {
        // 进栈
        if (n <= 2) {
            // 触底反弹
            return 1l;
        }
        long value = fibonacci(n - 1);
        long result = value + fibonacci(n - 2);
        return result;
    }
}