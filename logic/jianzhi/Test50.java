/**
 * 在排序数组中查找数字
 * 统计一个数字在排序数组中出现的次数。
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 */
public class Test50 {

    /**
     * 二分法
     *
     * 时间复杂度 O(log N) ： 二分法为对数级别复杂度。
     * 空间复杂度 O(1) ： 几个变量使用常数大小的额外空间。
     */
    public int search(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }
    int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] <= tar) {
                i = m + 1;
            }
            else {
                j = m - 1;
            }
        }
        return i;
    }

}
