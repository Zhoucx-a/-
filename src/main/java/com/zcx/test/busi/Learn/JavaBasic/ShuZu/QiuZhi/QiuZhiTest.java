package com.zcx.test.busi.Learn.JavaBasic.ShuZu.QiuZhi;

/**
 * 算法:求数值型数组中元素的最大值、最小值、平均数、总和等
 *
 * <p>
 * 定义一个int型一维数组。包含10个元素，分别赋一些随机整数
 * 求出所有元素的最大值、最小值、和值、平均数
 * 【要求】所有随机数都是二位数[10,99]
 * 公式:(int)(Math.random() * (99 - 10 + 1) + 10)
 * </p>
 *
 * @author : Yuki Judai 2022/2/11 16:28
 */
public class QiuZhiTest {
    public static void main(String[] args) {
        //初始化
        int[] arr = new int[10];

        //赋值并输出
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }

        System.out.print("数组值为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //最大值
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        //最小值
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        //总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        //平均数
        double avgValue = sum / arr.length;


        System.out.println("最大值:" + maxValue);
        System.out.println("最小值:" + minValue);
        System.out.println("总和:" + sum);
        System.out.println("平均数:" + avgValue);
    }
}
