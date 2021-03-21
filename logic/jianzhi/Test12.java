public class Test12 {
    /**
     * 给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent，
     * 求 base 的 exponent 次方。
     *
     * n%2=0(偶数): x的n次方 = (x*x)的(n/2)次方
     * n%2!=0(奇数): x的n次方 = x(x*x)的(n/2)次方
     *
     *
     * 因为 (x*x)n/2 可以通过递归求解，并且每次递归 n 都减小一半
     * 因此整个算法的时间复杂度为 O(logN)。
     *
     * 数学模型：快速幂
     */


    public static double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        boolean isNegative = false;
        //指数为负数的情况先当作正数计算 最后再分之一
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }
        double pow = Power(base * base, exponent / 2);
        if (exponent % 2 != 0) {
            pow = pow * base;
        }
        return isNegative ? 1 / pow : pow;
    }

    public static void main(String[] args) {
        System.out.println(Power(9,-4));
    }
}