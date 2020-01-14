package books.sword;

/**
 * Description 二维数组的查找
 * 在一个二维数组中，每一行都按照从左到右递增的
 * 顺序排序，每一列都按照从上到下递增的顺序排序。请完成一
 * 个函数，输入这样的一个二维数组和一个整数，判断数组中是
 * 否含有该整数
 * LeetCode 搜索二维矩阵 II 中等
 * Author liuweibin
 * Date 2020/1/14 10:27
 **/
public class S1_SearchIn2Array {
    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        System.out.print(solution2(matrix, -5));
    }

    /**
     * 复杂度m*n；
     * 思路 暴力法
     */
    public static boolean solution1(int[][] matrix, int target) {
        int l1 = matrix.length;
        if (l1 == 0) {
            return false;
        }
        int l2 = matrix[0].length;
        for (int i = 0; i < l1; i++) {
            for (int k = 0; k < l2; k++) {
                if (target == matrix[i][k]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 矩阵有个隐藏的特点；左上角和右下角分别代表最大最小值
     * 左下角的上面值都比这个小 右侧都比这个大。如果沿着这条路劲找只会有一条确定的路线，所以能找到值。
     * 右上角同上规律。
     * 可以通过小例子去模拟找到规律
     */
    public static boolean solution2(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        // 获取右上角坐标值
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
