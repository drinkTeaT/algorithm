package demo;

import demo.solution.StringToDoubleString;
import demo.solution.conclusion.BiggestMultiSubArraySolution;
import demo.solution.conclusion.RotateArraySolution;

/**
 * @author EDZ
 * @description
 * @date 2020/8/12 14:48
 */
public class Application {
    public static void main(String[] args) {
        ISolution solution = new BiggestMultiSubArraySolution(new int[]{2, 3, -2, 4,-1});
        long start = System.currentTimeMillis();
        solution.solution();
        System.out.println("耗时" + (System.currentTimeMillis() - start));
    }

}
