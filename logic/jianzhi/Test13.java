package 剑指Offer;

import java.util.Arrays;

public class Test13 {
    /**
     *调整数组顺序使奇数位于偶数前面,并保证偶数和偶数之间的相对位置不变
     *
     * 思路：每次遍历每次让偶数移到最后
     */
    public static void reOrderArray(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j]%2==0 && arr[j+1]%2==1){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arrray = {0,1,2,3,3,5,6,7,9,10,12,15,14,11};
        reOrderArray(arrray);
        System.out.println(Arrays.toString(arrray));
    }
}
