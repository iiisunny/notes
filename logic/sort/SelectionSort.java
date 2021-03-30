import java.util.Arrays;

/**
 * 选择排序
 * 平均：时间复杂度：O(n²) 空间复杂度：O(1)
 * 过程：每次遍历将最小元素置于首元素
 * 稳定性：不稳定
 */

public class SelectionSort {
    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            // 将首元素置为最小元素
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[minIndex]){
                    // 索引置换
                    minIndex = j;
                }
            }
            // 如果不是首元素最小 置换
            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,8,4,9,10,7,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
