package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description 91解码方法
 * @date 2020/8/12 19:12
 */
@AllArgsConstructor
public class DeCodeWaySolution implements ISolution {
    private String s;
    private int count;

    @Override
    public void solution() {
        System.out.println(numDecodings(s));
        System.out.println(myDynamicSolution(s));
    }

    private int numDecodings(String s) {
        return doDecode(s);
    }

    private Integer doDecode(String s) {
        // 正常返回
        if (s == null || s.length() < 1) {
            return 1;
        }
        String leftStr = s.length() > 1 ? s.substring(1) : "";
        String leftNode = s.substring(0, 1);
        Integer left = doDecode(leftStr);
        // 不满足条件返回
        if (Integer.valueOf(leftNode).intValue() == 0) {
            left = new Integer(0);
        }
        // 正常返回
        if (s.length() < 2 && Integer.valueOf(s).intValue() != 0) {
            return 1;
        }
        String rightStr = s.length() > 2 ? s.substring(2) : "";
        String rightNode = s.length() > 2 ? s.substring(0, 2) : s;
        int right = doDecode(rightStr);
        // 不满足条件返回
        if (Integer.valueOf(rightNode).intValue() < 10 || Integer.valueOf(rightNode).intValue() > 26) {
            right = new Integer(0);
        }
        return left + right;
    }

    private int myDynamicSolution(String s) {
        return 0;
    }

    private int dynamicSolution(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        char[] charArray = s.toCharArray();
        if (charArray[0] == '0') {
            return 0;
        }
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            if (charArray[i] != '0') {
                dp[i] = dp[i - 1];
            }
            int num = 10 * (charArray[i - 1] - '0') + (charArray[i] - '0');
            if (num >= 10 && num <= 26) {
                if (i == 1) {
                    dp[i]++;
                } else {
                    dp[i] += dp[i - 2];
                }
            }
        }
        return dp[len - 1];
    }
}
/**
 * 123
 * 1           12
 * 2 23        3
 * 3
 */
