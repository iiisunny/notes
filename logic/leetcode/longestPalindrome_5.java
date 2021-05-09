/**
 * 最长回文子串 - 5
 *
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *
 */
public class longestPalindrome_5 {

    /**
     * 暴力法
     *
     * 时间复杂度：O(n3)
     * 空间复杂度：O(1)
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        if (arr.length < 2){
            return s;
        }

        int begin = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (j - i > maxLen && isFalg(i,j,arr)){
                    begin = i;
                    maxLen = j - i;
                }
            }
        }
        return s.substring(begin, maxLen + begin + 1);

    }

    public static boolean isFalg(int begin, int end, char[] arr){
        while (begin < end){
            if (arr[begin] != arr[end]){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {
        String s = longestPalindrome("qwedfggfdekl");
        System.out.println(s);
        System.out.println(s.charAt(0));
    }
}
