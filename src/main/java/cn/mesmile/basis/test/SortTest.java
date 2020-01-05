package cn.mesmile.basis.test;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;


/**
 * @author zb
 * @date 2020/1/5 17:04
 * @Description: 冒泡排序
 *      每一轮比较得到的结果是剩余元素中最大值得值放到最右边
 */
public class SortTest {

    public static void main(String[] args) {
        // 冒泡排序
        int [] arr = {1,6,9,2,8,3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1 ; j < arr.length ; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(JSON.toJSONString(arr));

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        int [] arr2 = {2,3,8,1,0,6,4};
        Arrays.sort(arr2);

        int i = Arrays.binarySearch(arr2, 4);
        System.out.println(i);

    }
}
