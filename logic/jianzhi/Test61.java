/**
 * 礼物的最大价值
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
 * 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 12
 * 解释: 路径 1→3→5→2→1 可以拿到最多价值的礼物
 *
 */
public class Test61 {

    /**
     * 时间复杂度 O(mn)
     * 空间复杂度 O(1) ： 原地修改使用常数大小的额外空间
     * @param grid
     * @return
     */
    public int maxValue(int[][] grid) {

        // 获取行数和列数
        int m = grid.length;
        int n = grid[0].length;

        // 初始化第一行
        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i-1];
        }

        // 初始化第一列
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i-1][0];
        }

        // 移动
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.max(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
}
