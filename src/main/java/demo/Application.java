package demo;

import demo.solution.ClimbSolution;
import demo.solution.PalindromicSolution;

/**
 * @author EDZ
 * @description
 * @date 2020/8/12 14:48
 */
public class Application {
    public static void main(String[] args) {
        ISolution solution = new PalindromicSolution("babab");
        solution.solution();
    }

}
