/**
 * 0～n-1中缺失的数字
 *
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 * 输入: [0,1,3]
 * 输出: 2
 *
 * 输入: [0,1,2,3,4,5,6,7,9]
 * 输出: 8
 *
 * 排序数组中的搜索问题，首先想到 二分法 解决
 */
public class Test22 {
    /**
     * 时间复杂度 O(log N)： 二分法为对数级别复杂度
     * 空间复杂度 O(1)： 几个变量使用常数大小的额外空间
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m){
                i = m + 1;
            }
            else{
                j = m - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        int x = missingNumber(arr);
        System.out.println(x);
    }
}
