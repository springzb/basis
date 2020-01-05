package cn.mesmile.basis.test;

/**
 * @author zb
 * @date 2020/1/5 16:08
 * @Description:
 */
public class ValueTest {

    /**
     * 基本数据类型 数据存放在  栈  中
     * @param args
     */
    public static void main(String[] args) {
        int a = 1;
        System.out.println("改变前："+a);
        chang(a);
        System.out.println("改变后："+a);
        System.out.println("------------------------------------------------");
        int [] arr = {1,2,3,4,5,6};
        int sum = getSum(arr);
        System.out.println(sum);
    }

    private static void chang(int a) {
        a = 5;
        System.out.println("改变中："+a);
    }

    /**
     *  求和
     * @param arr  可变参数
     * @return     返回求和的结果
     */
    public static  int getSum(int...arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }


}
