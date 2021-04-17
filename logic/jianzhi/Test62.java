import java.util.HashMap;
import java.util.Map;

/**
 * 最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 */
public class Test62 {

    public static int lengthOfLongestSubstring(String s) {
        /**
         * 双指针 + 哈希表
         * 时间复杂度 O(N)
         * 空间复杂度 O(1)
         */
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0;
        for(int j = 0; j < s.length(); j++) {
            if(dic.containsKey(s.charAt(j))){
                i = Math.max(i, dic.get(s.charAt(j))); // 更新左指针 i
            }
            dic.put(s.charAt(j), j); // 哈希表记录
            res = Math.max(res, j - i); // 更新结果
        }
        return res;
    }

    public static void main(String[] args) {
        int x = lengthOfLongestSubstring("pwwkew");
        int a = lengthOfLongestSubstring("abcabcbb");
        int q = lengthOfLongestSubstring("abaertdf");
    }
}
