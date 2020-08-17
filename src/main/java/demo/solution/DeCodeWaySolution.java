package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

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
        numDecodings(s);
    }

    private int numDecodings(String s) {
        doDecode(s);
        return 1;
    }

    private void doDecode(String s) {
        if (s == null || s.length() < 1) {
            return;
        }
        String leftStr = s.length() > 1 ? s.substring(1) : "";
        String leftNode = s.substring(0, 1);
        doDecode(leftStr);
        System.out.println(leftNode);
        if (s.length() < 2) {
            return;
        }
        String rightStr = s.length() > 2 ? s.substring(2) : "";
        String rightNode = s.length() > 2 ? s.substring(0, 2) : s;
        doDecode(rightStr);
        System.out.println(rightNode);
    }
}
/**
 * 123
 * 1           12
 * 2 23        3
 * 3
 */
