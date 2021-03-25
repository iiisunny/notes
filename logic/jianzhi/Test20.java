import java.util.HashMap;
import java.util.Map;

/**
 * 数组中出现次数超过一半的数字
 * 
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 */

public class Test20 {

    /**
     * 摩尔投票法： 核心理念为 票数正负抵消
     *  时间复杂度为 O(N)
     *  空间复杂度为 O(1)
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0){
                x = num;
            }
            // votes = votes + ( num == x ? 1 : -1);
            votes += num == x ? 1 : -1;
        }
        return x;
    }

    /**
     * Hashmap存放
     * 时间复杂度为 O(N)
     * 空间复杂度为 O(N)
     *
     * @param nums
     * @return
     */
    public int majorityElement1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > n) {
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arrs = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int x = majorityElement(arrs);
        System.out.println(x);
    }
}
