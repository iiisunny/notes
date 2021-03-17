public class Test02 {
    /**
     * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.“，则输出”We%20are%20happy.“。
     * StringBuffer 线程安全
     * @param str    要转换的字符数组
     * @return 转换后使用的字符长度，-1表示处理失败
     */
    public static String replaceSpace(StringBuffer str) {
        int P1 = str.length() - 1;
        // 将一个空格追加两个空格成为三个空格 方便填充%20
        for (int i = 0; i <= P1; i++) {
            if (str.charAt(i) == ' ') {
                // append方法可以将指定字符串追加到此字符串末尾
                str.append("  ");
            }
        }
        int P2 = str.length() - 1;

        while (P1 >= 0 && P2 > P1) {
            // charAt方法可以返回指定索引处的char值
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("aaa a");
        StringBuffer str2 = new StringBuffer("We are happy.");
        replaceSpace(str1);
        replaceSpace(str2);
        System.out.println(str1);
        System.out.println(str2);
    }












}
