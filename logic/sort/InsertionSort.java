import java.util.Arrays;

/**
 * 插入排序
 * 平均：平均：时间复杂度：O(n²) 空间复杂度：O(1)
 * 过程：从第二个数据开始，对比之前的数据，如果当前数据小就置换
 * 稳定性：稳定
 */


public class InsertionSort {
    public static void insertion(int[] arr) {

        // 外层循环，从第二个数据开始对比
        for (int i = 1; i < arr.length; i++) {
            // 内层循环，与前面排好序的数据比较，如果后面的数据小于前面的则交换
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,8,4,9,10,7,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
