package demo;

import demo.solution.DailyTemperaturesSolution;
import demo.solution.MinEqualOperationSolution;
import demo.solution.PalindromicSubstringsSolution;
import demo.solution.RepeatedSubstringSolution;
import demo.solution.easy.ShunShiZhenDaYinSolution;

/**
 * @author EDZ
 * @description
 * @date 2020/8/12 14:48
 */
public class Application {
    public static void main(String[] args) {
        ISolution solution = new ShunShiZhenDaYinSolution(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
        long start = System.currentTimeMillis();
        solution.solution();
        System.out.println("耗时" + (System.currentTimeMillis() - start));
    }

}
