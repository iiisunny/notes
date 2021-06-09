package Array;

/**
 * 翻转字符串里的单词 - 151
 *
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 *
 * 说明：
 *
 * 无空格字符构成一个 单词 。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 *
 */
public class reverseWords_151 {
    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1;
        int i = j;
        StringBuilder res = new StringBuilder();

        // 必须从后向前遍历
        while (i >= 0){

            // 寻找空格
            while (i >= 0 && s.charAt(i) != ' '){
                i--;
            }

            // 添加元素
            res.append(s.substring(i + 1, j + 1) + " ");

            // 跳过多余空格
            while (i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            // 指向下一个元素的结尾字符
            j = i;
        }
        return res.toString().trim();

    }
}
