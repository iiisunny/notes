package 剑指Offer;

public class Test08 {
    /**
     *题目描述：
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
     */

    public static int JumpFloor(int n) {
        if (n <= 2)
            return n;
        int pre1 = 1, pre2 = 2;//便于n>=2时记录走一个还是走1  还是走2 （奇数偶数）的情况
        int result = 1;
        for (int i = 3; i <= n; i++) {
            result = pre1 + pre2;
            pre1 = pre2;
            pre2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(3));
    }
}
