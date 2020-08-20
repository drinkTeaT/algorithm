package demo;

import demo.solution.DailyTemperaturesSolution;

/**
 * @author EDZ
 * @description
 * @date 2020/8/12 14:48
 */
public class Application {
    public static void main(String[] args) {
        ISolution solution = new DailyTemperaturesSolution(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        long start = System.currentTimeMillis();
        solution.solution();
        System.out.println("耗时" + (System.currentTimeMillis() - start));
    }

}
