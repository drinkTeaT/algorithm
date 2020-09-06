package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

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
        System.out.println(longestPalindrome(s));
        System.out.println(System.currentTimeMillis() - start);
    }

    private String longestPalindromeSubseq(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        String max = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j++) {
                String s1 = s.substring(i, j);
                if (max.length() > s1.length()){
                    continue;
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

    private String max;
    public String longestPalindrome(String s) {
        max = s.substring(0,1);
        int c = 0;
        while(c < s.length()){
            doExpand(s,c++);
        }
        return max;
    }

    private void doExpand(String s,int c){
        int l = c;
        int r = c;
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            max = r - l+1 > max.length() ? s.substring(l,r - l + 1):max;
            l--;
            r++;
        }
        l = c;
        r = c + 1;
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            max = r - l+1 > max.length() ? s.substring(l,r - l + 1):max;
            l--;
            r++;
        }
    }
}