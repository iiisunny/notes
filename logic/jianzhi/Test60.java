/**
 * 求1+2+…+n
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 *
 * 输入: n = 3
 * 输出: 6
 */
public class Test60 {

    /**
     * 递归
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     * @param n
     * @return
     */
    int res = 0;
    public int sumNums(int n) {
        boolean x = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }
}
