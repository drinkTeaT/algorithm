package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;
import util.PrintUtil;

import java.util.Stack;

/**
 * @author EDZ
 * @description 每日温度 739
 * 给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * @date 2020/8/20 15:46
 */
@AllArgsConstructor
public class DailyTemperaturesSolution implements ISolution {
    private int[] t;

    @Override
    public void solution() {
        PrintUtil.printArray(myDailyTemperatures(t));
    }

    private int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }
            if (t[i] < t[stack.peek()]) {
                stack.push(i);
                continue;
            }
            while (!stack.isEmpty() && t[i] > t[stack.peek()]) {
                int d = stack.pop();
                res[d] = i - d;
            }
            stack.push(i);
        }
        return res;
    }

    public int[] myDailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[t.length];
        for(int i = 0;i < t.length;i++){
            // 出栈
            while(!stack.isEmpty() && t[stack.peek()] < t[i]){
                int v = stack.pop();
                res[v] = i -v;
            }
            stack.push(i);
        }
        return res;
    }
}
