package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description 单个线性字符串变成两个线性字符串
 * example: 12345
 * output:
 * <p>         1
 * <p>       2    3
 * <p>     4        5
 * <p> 13524
 * @date 2020/8/19 10:38
 */
@AllArgsConstructor
public class StringToDoubleString implements ISolution {
    private String s;

    @Override
    public void solution() {
        System.out.println(rightRecursive(s) + leftRecursive(s));
        System.out.println(dynamicSolution(s));
    }

    /**
     * 递归
     */
    private String rightRecursive(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        String rightNode = s.substring(0, 1);
        if (s.length() < 2) {
            return rightNode;
        }
        return rightNode + rightRecursive(s.substring(2));
    }

    private String leftRecursive(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        String leftNode = s.substring(1, 2);
        if (s.length() < 3) {
            return leftNode;
        }
        return leftNode + rightRecursive(s.substring(3));
    }

    /**
     * 动态规划
     *
     * @param s
     * @return
     */
    private String dynamicSolution(String s) {
        int len = s.length();
        String[] res = new String[len];
        res[0] = s.substring(0, 1);
        res[1] = s.substring(1, 2);
        for (int i = 2; i < len; i++) {
            String next = s.substring(i, i + 1);
            res[i] = res[i - 2] + next;
        }
        return res[len - 1] + res[len - 2];
    }
}
