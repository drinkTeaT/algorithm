package demo;

import demo.solution.DailyTemperaturesSolution;
import demo.solution.MinEqualOperationSolution;
import demo.solution.PalindromicSubstringsSolution;
import demo.solution.RepeatedSubstringSolution;

/**
 * @author EDZ
 * @description
 * @date 2020/8/12 14:48
 */
public class Application {
    public static void main(String[] args) {
        ISolution solution = new RepeatedSubstringSolution("abacababacab");
        long start = System.currentTimeMillis();
        solution.solution();
        System.out.println("耗时" + (System.currentTimeMillis() - start));
    }

}
