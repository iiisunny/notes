import java.util.*;

public class Testjianzhioffer {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            this.val = x;
        }
    }
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int x){
            this.val = x;
        }
    }

    public static int[] mergesort(int[] array) {
        if (array.length < 2){
            return array;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,array.length);
        return merge(mergesort(left), mergesort(right));
    }

    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length){
                result[index] = right[j++];
            } else if (j >= right.length){
                result[index] = left[i++];
            } else if (left[i] < right[j]){
                result[index] = left[i++];
            }else{
                result[index] = right[j++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        int[] arr1 = new int[]{3,3,3,7,9,122344,4656,34,34,4656,5,6,7,8,9,343,57765,23,12321};
        int[] aaaa = mergesort(arr);
        int[] aaaaaa = mergesort(arr1);
        for (int i = 0; i < aaaa.length; i++) {
            System.out.println(aaaa[i]);
        }
        for (int i = 0; i < aaaaaa.length; i++) {
            System.out.println(aaaaaa[i]);
        }
    }


}