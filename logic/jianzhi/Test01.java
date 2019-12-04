package 剑指Offer;

public class Test01 {
    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * <p/>
     * 规律：首先选取数组中右上角的数字。如果该数字等于要查找的数字，查找过程结束：
     * 从右上角开始，若小，向下走，删除一行，若大，向左走，删除
     * 也就是说如果要查找的数字不在数组的右上角，则每－次都在数组的查找范围中剔除）行或者一列，这样每一步都可以缩小
     * 查找的范围，直到找到要查找的数字，或者查找范围为空。

     * @param array 待查找的数组
     * @param target 要查找的数
     * @return 查找结果，true找到，false没有找到
     */
    public static boolean find(int[][] array,int target) {
        //判断数组合法
        if (array == null) {
            return false;
        }
        int nums1 = array.length;//行数
        int nums2 = array[0].length;//列数

        //右上角作为限制起始行列
        int num1 = 0;
        int num2 = nums2 - 1;

        //要查找的位置确保在数组之内
        while (num1 < nums1 && num2 >= 0) {
            if (array[num1][num2] == target) {// 如果找到了就直接退出
                return true;
            } else if (array[num1][num2] < target) {// 如果找到的数比要找的数小，说明要找的数在当前数的下边
                num1++;
            } else {// 如果找到的数比要找的数大，说明要找的数在当前数的左边
                num2--;
            }
        }
            return false;

    }

    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{2,4,6,8},{5,9,12,14},{6,17,19,22},{10,20,30,41}};

        System.out.println(find(arr,18));
        System.out.println(find(arr,14));
        System.out.println(find(arr,11));
        System.out.println(find(arr,30));
        System.out.println(find(arr,12));
        System.out.println(find(null,7));
    }

}


