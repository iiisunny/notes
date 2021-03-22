import java.util.Arrays;

public class Test13 {
    /**
     *调整数组顺序使奇数位于偶数前面,并保证偶数和偶数之间的相对位置不变
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

    public static void main(String[] args) {
        int[] array = {0,1,2,3,3,5,6,7,9,10,12,15,14,11};
        reOrderarrayay(array);
        System.out.println(Arrays.toString(array));
    }
}
