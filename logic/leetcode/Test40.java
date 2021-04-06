/**
 * 不用加减乘除做加法
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 *
 * 输入: a = 1, b = 1
 * 输出: 2
 */
public class Test40 {

    /**
     * a + b = (a^b) ^ ((a &b ) << 1)
     * @param a
     * @param b
     * @return
     */
    public static int add(int a, int b) {
        // b接收的是与运算进位，终会等于零（最多32次），而a为异或运算基本上不可能等于零
        while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;

//        if (b == 0) {
//            return a;
//        }
//
//        // 转换成非进位和 + 进位
//        return add(a ^ b, (a & b) << 1);

    }

    public static void main(String[] args) {
        int x = add(7, 21);
        System.out.println(x);

        System.out.println(16 ^ 4);
        System.out.println((16 & 4) << 1);
    }
}
