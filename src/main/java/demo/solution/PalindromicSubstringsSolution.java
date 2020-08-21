package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description 回文子串 647
 * 输入："aaa"
 * 输出：6
 * 解释：6个回文子串: "a", "a", "a", "aa", "aa", "aaa"
 * @date 2020/8/21 11:06
 */
@AllArgsConstructor
public class PalindromicSubstringsSolution implements ISolution {
    private String s;
    private int count;

    private void doOp(String s) {

    }

    private boolean isPalindrome(String s) {
        int l = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(l--)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void solution() {
        doOp(s);
        System.out.println(count);
    }
}
