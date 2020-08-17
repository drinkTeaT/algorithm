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


//    private Integer dynamicSolution(String s){
//
//    }
}
/**
 * 123
 * 1           12
 * 2 23        3
 * 3
 */
