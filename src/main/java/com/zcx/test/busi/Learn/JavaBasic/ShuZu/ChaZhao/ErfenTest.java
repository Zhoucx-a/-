package com.zcx.test.busi.Learn.JavaBasic.ShuZu.ChaZhao;

/**
 * 二分法查找（折半查找）
 * 前提:所要查找得数组必须有序
 *
 * @author : Yuki Judai 2022/2/15 14:33
 */
public class ErfenTest {
    public static void main(String[] args) {

        int[] arr = new int[]{-98, -34, 2, 34, 54, 68, 123};

        int dest = 2;
        int head = 0;
        int end = arr.length - 1;

        while (head <= end) {
            int middle = (head + end) / 2;

            if (arr[middle] == dest) {
                System.out.println("找到了！位置为:" + middle);
                break;
            } else if (arr[middle] > dest) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }
    }
}
