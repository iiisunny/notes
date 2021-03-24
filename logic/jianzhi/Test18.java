import java.util.ArrayList;
import java.util.List;

/**
 * 打印从1到最大的n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * Input:
 * {1,3,5},{2,4,6}
 *
 * Output:
 * {1,2,3,4,5,6}
 */
public class Test18 {

    /**
     * 不考虑超出int的大数
     *
     * 时间复杂度：O(10 ^ n)
     * 空间复杂度：算上返回值 O(10 ^ n) 不算返回值 O(1)
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        int end = (int)Math.pow(10, n) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++)
            res[i] = i + 1;
        return res;
    }

    /**
     * 考虑到出现的大数情况，一般的类型是无法表示的，所有用字符串来模拟处理。
     *
     * 由于不超过n位，所以申请长度为n的字符串即可，初始化n个0
     * 利用字符串模拟加1操作
     * 模拟进位操作
     *
     * @param n
     * @return
     */
    public static int[] printNumbers1(int n) {
        StringBuilder str = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        // 将str初始化为n个'0'字符组成的字符串
        for (int i = 0; i < n; i++) {
            str.append('0');
        }
        while(!increment(str)){
            // 去掉左侧的0
            int index = 0;
            while (index < str.length() && str.charAt(index) == '0'){
                index++;
            }
            // 将字符串转换为整数存入list中
            int temp = Integer.parseInt(str.toString().substring(index));
            list.add(temp);
        }
        // 结果集
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }

    private static boolean increment(StringBuilder str) {
        // 判断是否越界
        boolean isOverflow = false;
        // 从字符串的最后一位开始处理，即"数"的各位
        for (int i = str.length() - 1; i >= 0; i--) {
            // 获取该位的字符
            char s = (char)(str.charAt(i) + 1);
            // 如果s大于'9'则发生进位
            if (s > '9') {
                // 进位操作
                str.replace(i, i + 1, "0");
                // 如果此时i是最大位了
                if (i == 0) {
                    isOverflow = true;
                }
            }
            // 没发生进位则跳出for循环，加1操作
            else {
                str.replace(i, i + 1, String.valueOf(s));
                break;
            }
        }
        return isOverflow;
    }

    public static void main(String[] args) {
        int[] arrs = printNumbers1(1);
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
    }


}