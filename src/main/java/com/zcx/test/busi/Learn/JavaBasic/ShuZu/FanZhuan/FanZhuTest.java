package com.zcx.test.busi.Learn.JavaBasic.ShuZu.FanZhuan;

/**
 * 数组反转操作
 *
 * @author : Yuki Judai 2022/2/15 14:25
 */
public class FanZhuTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ", "DD", "MM"};

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
