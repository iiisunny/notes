import java.util.Arrays;

/**
 * 冒泡排序
 * 平均：时间复杂度：O(n²) 空间复杂度：O(1)
 * 过程：比较相邻的两个数，如果后者小，就交换位置，最终从小到大排列
 * 稳定性：稳定
 */

public class BubbleSort{
    // 未优化
    public static void bubble1(int[] arr){
        for (int i=0;i < arr.length-1;i++){
            for (int j=0;j < arr.length-1-i;j++){
                if (arr[j+1]<arr[j]){
                    arr[j+1] = arr[j+1] + arr[j];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                }
            }
        }
    }

    // 优化
    public static void bubble2(int[] arr){
        boolean flag;  // 是否交换的标志
        for (int i=0;i < arr.length-1;i++){
            // 每次遍历的标志位都先置为false才能判断后面的元素是否发送了变化
            flag = false;
            for (int j=0;j < arr.length-1-i;j++){
                // 置换元素
                if (arr[j+1]<arr[j]){
                    arr[j+1] = arr[j+1] + arr[j];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                    flag = true;
                }
            }
            if(!flag){
                // 优化核心
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2,5,8,4,9,10,7};
        int[] arr2 = new int[]{2,9,5,7,10,3,6};
        bubble1(arr1);
        bubble2(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
