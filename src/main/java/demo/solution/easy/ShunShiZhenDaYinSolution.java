package demo.solution.easy;

import demo.ISolution;
import lombok.AllArgsConstructor;

/**
 * @author EDZ
 * @description 顺时针从外到里打印 29
 * @date 2020/8/25 14:35
 */
@AllArgsConstructor
public class ShunShiZhenDaYinSolution implements ISolution {
    private int[][] matrix;

    private int[] spiralOrder(int[][] matrix) {
        int up = 0;
        int right = matrix[0].length - 1;
        int left = 0;
        int down = matrix.length - 1;
        int i = 0;
        int j = 0;
        int[] res = new int[matrix.length * matrix[0].length];
        int c = 0;
        while (right >= left || down >= up) {
            if (i == up && j == left && i >= down && j <= right) {
                // 右上角，往下
                while (i <= down) {
                    res[c++] = matrix[i++][j];
                }
                // 更新右边界
                right--;
                j--;
                i--;

            } else if (i == up && j == right && j >= left) {
                // 右下角，往左
                while (j >= left) {
                    res[c++] = matrix[i][j--];
                }
                // 更新下边界
                down--;
                i--;
                j++;
            }else if(i == 0){
                // 左上角，往右
                while (j <= right) {
                    res[c++] = matrix[i][j++];
                }
                // 更新上边界
                up++;
                i++;
                j--;
            }
            // 左下角，往上
            while (i >= up) {
                res[c++] = matrix[i--][j];
            }
            // 更新左边界
            left++;
            j++;
            i++;
        }
        return res;
    }

    @Override
    public void solution() {
        System.out.println(spiralOrder(matrix));
    }
}
