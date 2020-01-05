package cn.mesmile.basis.test;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author zb
 * @date 2020/1/5 14:52
 * @Description:
 */
public class ForTest {

    /**
     *             i    j
     *      *      1    1
     *      **     2    2
     *      ***    3    3
     *      ****   4    4
     *      *****  5    5
     */

    /**
     *              i   j
     *      *****   1   5
     *      ****    2   4
     *      ***     3   3
     *      **      4   2
     *      *       5   1
     */

    /**
     *          i   j   k    j=5-i   k=i
     *  0000*   1   4   1
     *  000**   2   3   2
     *  00***   3   2   3
     *  0****   4   1   4
     *  *****   5   0   5
     */

    /**
     *              i    j   k
     *      *       1    4   1
     *    *   *     2    3   2
     *  *   *   *   3    2   3
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        for (int k = 1; k <= 5 ; k++) {
            for (int m = 1; m <= 6-k ; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5-i ; j++) {
                System.out.print("0");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        /**
         *  for循环步骤：
         *  1  2  4  3
         *  2  4  3
         *  2
         *
         *  结果:
         *  2
         *  6
         *  10
         */
        for (int i = 0; i++ < 10; i+=2) {
            System.out.println(++i);
        }

    }



}
