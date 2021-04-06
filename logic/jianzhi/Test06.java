/**
 * 数组的旋转
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 *
 * 输入：[2,2,2,0,1]
 * 输出：0
 *
 */
public class Test06 {

    /**
     * 二分法
     *
     * 时间复杂度 O(log_2 N)
     * 空间复杂度 O(1)
     *
     * 寻找旋转数组的最小元素即为寻找 右排序数组 的首个元素
     * @param numbers
     * @return
     */
    public static int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            }
            else if (numbers[m] < numbers[j]) {
                j = m;
            }
            else {
                j--;
            }
        }
        return numbers[i];
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,2,3};
        System.out.println(minArray(arr));
    }

}
