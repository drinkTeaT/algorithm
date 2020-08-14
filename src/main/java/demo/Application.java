package demo;

import demo.solution.conclusion.BiggestMultiSubArraySolution;

/**
 * @author EDZ
 * @description
 * @date 2020/8/12 14:48
 */
public class Application {
    public static void main(String[] args) {
        ISolution solution = new BiggestMultiSubArraySolution(new int[]{2, 3, -2, 4});
        solution.solution();
    }

}
