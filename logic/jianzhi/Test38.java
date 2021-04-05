import java.util.HashMap;

/**
 * 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回 " "
 */
public class Test38 {
    /**
     * 时间复杂度 O(N) ： N 为字符串 s 的长度；需遍历 s 两轮，使用 O(N) ；HashMap 查找操作的复杂度为 O(1) ；
     * 空间复杂度 O(1) ： 由于题目指出 s 只包含小写字母，因此最多有 26 个不同字符，HashMap 存储需占用 O(26) =O(1) 的额外空间。
     *
     */
    public static char firstUniqChar(String s) {
        HashMap<Character, Boolean> hashMap = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc){
            hashMap.put(c, !hashMap.containsKey(c));
        }
        for(char c : sc){
            // 第一个只出现一次的字符
            if(hashMap.get(c)) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "abaccdeff";
        char ss = firstUniqChar(s);
        System.out.println(ss);
    }

}
