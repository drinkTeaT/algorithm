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

    @Override
    public void solution() {
        System.out.println(numDecodings(s));
    }

    private int numDecodings(String s) {
        return doDecode(s, 0);
    }

    private int doDecode(String s, int start) {
        if (s == null || "".equals(s) || "0".equals(s)) {
            return 0;
        }
        if (s.length()-(start+1) == 1 && Integer.valueOf(s.substring((start+1),1)).intValue() != 0) {
            return 1;
        }
        if (s.length()-(start+1) == 1 && Integer.valueOf(s.substring((start+1),1)).intValue() == 0){
            return 0;
        }
        if (s.length()-(start+2) == 2 && Integer.valueOf(s.substring((start+2),2)).intValue() < 26){
            return 1;
        }
        int leftCount = doDecode(s.substring((start + 1), s.length() - (start + 1)), start + 1);
        int rightCount = doDecode(s.substring((start + 2), s.length() - (start + 2)), start + 2);
        return leftCount + rightCount;
    }
}
/**
 * 123
 * 1           12
 * 2 23        3
 * 3
 */
