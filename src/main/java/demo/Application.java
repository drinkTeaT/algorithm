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
        ISolution solution = new DeCodeWaySolution("6065812287883668764831544958683283296479682877898293612168136334983851946827579555449329483852397155"
                , 0);
        long start = System.currentTimeMillis();
        solution.solution();
        System.out.println("耗时" + (System.currentTimeMillis() - start));
    }

}
