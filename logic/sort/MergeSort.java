import java.util.Arrays;

/**
 * 冒泡排序
 * 平均：时间复杂度：O(nlogn) 空间复杂度：O(n)
 * 过程：将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。
 * 稳定性：稳定
 */
public class MergeSort {
    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }
    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length){
                result[index] = right[j++];
            }
            else if (j >= right.length){
                result[index] = left[i++];
            }
            else if (left[i] > right[j]){
                result[index] = right[j++];
            }
            else{
                result[index] = left[i++];
            }
        }
        return result;
    }




    public static int[] merge1(int[] arr){
        if (arr.length < 2){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        return dfs(merge1(left), merge1(right));
    }

    public static int[] dfs(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        for (int index = 0,i = 0,j = 0; index < result.length;index++){
            if (i >= left.length){
                result[index] = right[j++];
            }
            else if (j >= right.length){
                result[index] = right[i++];
            }
            else if (left[i] > right[j]){
                result[index] = right[j++];
            }
            else {
                result[index] = right[i++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,8,3,2,1,5};
        int[] arrs = merge1(arr);
        for (int j : arrs) {
            System.out.println(j);
        }
    }


































}
