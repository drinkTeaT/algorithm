package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EDZ
 * @description leetcode-5 最长回文子串；复杂度有点高
 * Input: "bbbab"
 * Output: 4
 * @date 2020/8/12 16:59
 */
@AllArgsConstructor
public class PalindromicSolution implements ISolution {
    private String s;

    @Override
    public void solution() {
        long start = System.currentTimeMillis();
        System.out.println(longestPalindromeSubseq(s));
        System.out.println(System.currentTimeMillis() - start);
    }

    private String longestPalindromeSubseq(String s) {
        String max = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                String s1 = s.substring(i, j);
                if (max.length() > s1.length()/2){
                    return max;
                }
                if (isPalindrome(max, s1)) {
                    max = s1.length() > max.length() ? s1 : max;
                }
            }
        }
        return max;
    }

    private boolean isPalindrome(String max, String s) {
        if (max.length() > s.length()) {
            return false;
        }
        int l = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(l--)) {
                return false;
            }
        }
        return true;
    }
}