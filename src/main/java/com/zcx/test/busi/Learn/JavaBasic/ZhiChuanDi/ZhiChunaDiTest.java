package com.zcx.test.busi.Learn.JavaBasic.ZhiChuanDi;

/**
 * 值传递机制测试
 *
 * @author : Yuki Judai 2022/2/18 13:16
 */
public class ZhiChunaDiTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 234, 235, 6, 8, -2, 55, 96, 3};

        ZhiChunaDiTest zhiChunaDiTest = new ZhiChunaDiTest();
        zhiChunaDiTest.maoPao(arr);

        //输出结果
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }


        int m = 10;
        int n = 20;

        zhiChunaDiTest.swap(m, n);
        System.out.println("m=" + m + ",n=" + n);

        System.out.println(new int[]{});
    }

    private void maoPao(int[] arr) {
        /*
         * 升序
         */
        //总共几轮
        for (int i = 0; i < arr.length - 1; i++) {
            //每一轮比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private void swap(int m, int n) {
        int temp = n;
        n = m;
        m = temp;
    }

}
