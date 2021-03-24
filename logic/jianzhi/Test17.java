import java.util.HashSet;
import java.util.Set;


/**
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 *
 * Input:
 * [2, 3, 1, 0, 2, 5, 3]
 *
 * Output:
 * 2 或 3
 */

public class Test17 {
    // 桶排序
    public int findRepeatNumber(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
            if(arr[nums[i]] > 1) {
                return nums[i];
            }
        }
        return -1;
    }

    /**
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * boolean add(E e);
     */
    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }

}
