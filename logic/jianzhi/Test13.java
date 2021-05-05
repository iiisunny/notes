import java.util.Arrays;

public class Test13 {
    /**
     * 调整数组顺序使奇数位于偶数前面
     *
     *  调整数组顺序使奇数位于偶数前面,并保证偶数和偶数之间的相对位置不变
     *
     * 思路：
     * 1.两次遍历，一次从前往后一次从后往前，第一遍只扫奇数放额外数组前半部分，第二遍扫偶数放后半部分
     * 2.类似冒泡，遇到一个奇数，前面的偶数往后挪一位，腾出奇数的位置放进去。
     */

    public static int[] reOrderarrayay(int[] array){
        for (int i = 0;i<array.length-1;i++){

            // 最后面位置的偶数先排好序
            for (int j = 0;j<array.length-1-i;j++){
                if (array[j]%2==0 && array[j+1]%2==1){
                    array[j] = array[j] + array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j] - array[j+1];
                }
            }
        }
        return array;

    }

    /**
     *
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
     *
     * 双指针: 双头部遍历
     *
     * 设定2个指针,s1,s2
     * 同时从第一个元素出发
     * s1找到偶数,s2找到奇数
     * 如果偶数在奇数前面,交换位置
     * 否则偶数不动,不交换,继续找后面的奇数
     * @param nums
     */

    public int[] exchange(int[] nums) {
        int i=0,j=0;
        while(j<nums.length){
            if((nums[j]&1)!=0){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
            }
            j++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array = {0,1,2,3,3,5,6,7,9,10,12,15,14,11};
        reOrderarrayay(array);
        System.out.println(Arrays.toString(array));
    }
}
