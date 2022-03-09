package com.zcx.test.busi.Learn.JavaBasic.ShuZu.PaiXu;

/**
 * 冒泡排序
 * 从前往后相邻元素比较
 *
 * @author : Yuki Judai 2022/2/15 15:35
 */
public class MaoPaoTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 234, 235, 6, 8, -2, 55, 96, 3};

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

        //输出结果
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }
}
