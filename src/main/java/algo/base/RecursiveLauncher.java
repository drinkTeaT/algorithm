package algo.base;

import util.StaticUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归专用
 */
public class RecursiveLauncher {
    static Recursive recursive = new Recursive();

    public static void main(String[] args) {
//        recursive.deapValue(StaticUtil.root, 3);
        new RecursiveThinking().deapValue(StaticUtil.buildTree(), 4);
    }

    /**
     * n的阶乘
     */
    private static void multify() {

        System.out.println(recursive.multiplyNumber(4));
    }

    /**
     * 菲波拉契
     */
    private static void fab() {
        Recursive recursive = new Recursive();
        List<Long> values = new ArrayList<>();
        values.add(0l);
        values.add(1l);
        for (int i = 2; i < 10; i++) {
            values.add(recursive.fibonacci(i));
        }
        System.out.println(values);
    }
}
