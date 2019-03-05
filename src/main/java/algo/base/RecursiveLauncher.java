package algo.base;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归专用
 */
public class RecursiveLauncher {
    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        System.out.println(recursive.multiplyNumber(4));
        List<Long> values = new ArrayList<>();
        values.add(0l);
        values.add(1l);
        for (int i = 2;i<10;i++){
            values.add(recursive.fibonacci(i));
        }
        System.out.println(values);
    }
}
