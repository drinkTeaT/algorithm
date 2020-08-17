package demo;

import demo.solution.DeCodeWaySolution;
import demo.solution.conclusion.BiggestMultiSubArraySolution;

/**
 * @author EDZ
 * @description
 * @date 2020/8/12 14:48
 */
public class Application {
    public static void main(String[] args) {
        ISolution solution = new DeCodeWaySolution("291834729", 0);
        long start = System.currentTimeMillis();
        solution.solution();
        System.out.println("耗时" + (System.currentTimeMillis() - start));
    }

}
