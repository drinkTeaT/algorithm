package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description 459. 重复的子字符串
 * @date 2020/8/24 10:09
 */
@AllArgsConstructor
public class RepeatedSubstringSolution implements ISolution {
    private String s;

    @Override
    public void solution() {
        System.out.println(repeatedSubstringPattern(s));
    }

    private boolean repeatedSubstringPattern(String s) {
        return true;
    }
}
