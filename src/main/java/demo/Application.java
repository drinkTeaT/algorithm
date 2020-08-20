package demo;

import demo.solution.LongestPrefixSolution;

/**
 * @author EDZ
 * @description
 * @date 2020/8/12 14:48
 */
public class Application {
    public static void main(String[] args) {
        ISolution solution = new LongestPrefixSolution(new String[]{"flower", "flow", "flight"});
        long start = System.currentTimeMillis();
        solution.solution();
        System.out.println("耗时" + (System.currentTimeMillis() - start));
    }

}
