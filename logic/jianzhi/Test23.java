/**
 * 机器人的运动范围
 *
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 *
 * 输入：m = 2, n = 3, k = 1
 * 输出：3
 *
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 *
 *
 * 题目中描述是从 (0,0) 位置开始的，每次只能走一格，上下左右都行
 * 简化一下问题，因为(0,0)位置是一个角落，那么走的方向只有两种
 * 1：往下走一格 即:(x+1,y)
 * 2：往右走一格 即:(x,y+1)
 *
 * 走过的格子记忆
 * 1：判断此格子走没走过，如果走过则剪枝return
 * 2：如果没有走过，将此位置记录，继续dfs，往下或往右，直至不符合条件
 *
 */
public class Test23 {

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(visited, m, n, k, 0, 0);
    }


    private int dfs(boolean[][] visited, int m, int n, int k, int i, int j) {
        // 如果visited[i][j] 说明遍历过了 剪枝
        if(i >= m || j >= n || visited[i][j] || bitSum(i) + bitSum(j) > k){
            return 0;
        }
        visited[i][j] = true;
        return 1 + dfs(visited, m, n, k, i + 1, j) + dfs(visited, m, n, k, i, j + 1) ;
    }

    private int bitSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


}
