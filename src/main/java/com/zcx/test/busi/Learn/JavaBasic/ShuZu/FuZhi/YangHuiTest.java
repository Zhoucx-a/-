package com.zcx.test.busi.Learn.JavaBasic.ShuZu.FuZhi;

/**
 * 使用二维数组打印一个10行的杨辉三角
 * <p>
 * 【提示】
 * 1.第一行有1个元素，第 N 行有 N 个元素
 * 2.每一行的第一个元素和最后一个元素都是1
 * 3.从第三行开始，对于非第一个元素和最后一个元素的元素。即:
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
 * </p>
 *
 * @author : Yuki Judai 2022/2/11 15:52
 */
public class YangHuiTest {
    public static void main(String[] args) {
        //声明并初始化二维数组
        int[][] yanghui = new int[10][];

        //二维数组赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];

            //每行首尾元素赋值
            yanghui[i][0] = yanghui[i][i] = 1;

            //每行非首尾元素赋值
            for (int j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
            }
        }

        //遍历二维数组
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }

    }
}
