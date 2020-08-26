package demo.solution;

import demo.ISolution;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author EDZ
 * @description 39. 组合总和
 * 输入：candidates = [2,3,6,7], target = 7,
 * 所求解集为：
 * [
 * [7],
 * [2,2,3]
 * ]
 * @date 2020/8/26 13:46
 */
@AllArgsConstructor
public class CombinationSumSolution implements ISolution {
    private int[] candidates;
    private int target;

    @Override
    public void solution() {
        List<List<Integer>> res = combinationSum(candidates, target);
        res.forEach(x -> System.out.println(x));
    }

    private List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        doSolution(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void doSolution(int[] candidates, int target, int index, List<Integer> list, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            // 准备添加所有节点
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            doSolution(candidates, target - candidates[i], i, list, res);
            list.remove(list.size() - 1);
        }
    }
}
