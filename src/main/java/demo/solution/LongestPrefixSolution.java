package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description 最长前缀 14
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * @date 2020/8/20 11:05
 */
@AllArgsConstructor
public class LongestPrefixSolution implements ISolution {
    private String[] strings;

    @Override
    public void solution() {
        longestCommonPrefix(strings);
    }

    private String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String[] res = new String[strs.length];
        res[0] = strs[0];
        for(int i = 1;i < strs.length;i++){
            res[i] = "";
            int j = 0;
            while(j < Math.min(strs[i].length(),res[i-1].length()) && strs[i].charAt(j) == res[i-1].charAt(j)){
                res[i] += strs[i].charAt(j);
                j++;
            }
            if(res[i] == null || "".equals(res[i])){
                return "";
            }
        }
        return res[strs.length-1];
    }
}
