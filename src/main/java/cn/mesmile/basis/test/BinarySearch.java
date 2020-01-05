package cn.mesmile.basis.test;

/**
 * @author zb
 * @date 2020/1/5 17:27
 * @Description: 二分法查找
 */
public class BinarySearch {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int i = binarySearch(arr, 20);

        System.out.println(i);

    }

    /**
     * 返回下标
     * @param arr 目标数组
     * @param a   所猜测的数
     * @return    下标
     */
    public static int binarySearch(int [] arr, int a) {
        int min = 0;
        int max = arr.length-1;
        int middle = (min + max) / 2;

        while (min <= max) {
            if (arr[middle] == a) {
                return middle;
                // 若中间的数 大于所猜测的数
            } else if (arr[middle] > a) {
                max = middle - 1;
                middle = (min + max) / 2;
            } else {
                min = middle + 1;
                middle = (min + max) / 2;
            }
        }
        // 返回 -1 表示没有找到
        return -1;
    }
}
