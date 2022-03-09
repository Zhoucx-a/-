package com.zcx.test.busi.Learn.JavaBasic.ShuZu.ChaZhao;

/**
 * 线性查找（从前往后一个一个找）
 *
 * @author : Yuki Judai 2022/2/15 14:32
 */
public class XianXingTest {
    public static void main(String[] args) {
        String dest = "DD";
        String[] arr = new String[]{"JJ", "DD", "MM"};

        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到了指定元素，位置为:" + i);
                break;
            }
        }
    }
}
