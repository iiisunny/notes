import java.util.Arrays;

/**
 * 希尔排序
 * 平均：平均：时间复杂度：O(nlog n) 空间复杂度：O(1)
 * 过程：同插入排序，每次循环的布长通过减半实现
 * 稳定性：不稳定
 */

public class ShellSort {

    public static void shell(int[] arr) {

        // i层循环控制步长
        for (int i = arr.length / 2; i > 0; i /= 2) {
            // j控制无序端的起始位置
            for (int j = i; j < arr.length; j++) {
                // 置换
                //j,k为插入排序，不过步长为i
                for (int k = j; k > 0  && k - i >= 0; k -= i) {
                    if (arr[k] < arr[k - i]) {
                        int temp = arr[k - i];
                        arr[k - i] = arr[k];
                        arr[k] = temp;
                    } else {
                        break;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,8,4,9,10,7,2};
        shell(arr);
        System.out.println(Arrays.toString(arr));
    }
}
