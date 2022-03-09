package com.zcx.test.busi.Learn.JavaBasic.ShuZu.Clone;

/**
 * 使用简单数组
 *
 * <p>
 * (1)声明arr1和arr2两个int[]类型数组变量
 * (2)使用大括号，把arr1初始化为8个素数：2,3,5,7,11,13,17,19
 * (3)显示arr1的内容
 * (4)赋值arr2变量等于arr1，修改arr2中的偶索引元素，使其等于索引值（如arr2[0] = 0,arr2[2] = 2）。打印出arr1
 * 【思考】arr1和arr2是什么关系？arr1和arr2的地址值相同，都指向了堆空间中唯一的一个数组实体。
 * 【拓展】修改题目，实现arr2对arr1数组的复制
 * </p>
 *
 * @author : Yuki Judai 2022/2/11 16:51
 */
public class CloneTest {
    public static void main(String[] args) {
        int[] arr1, arr2;
        arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        //显示arr1的内容
        System.out.println("arr1的内容（前）:");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        //浅拷贝
        arr2 = arr1;

//        //深拷贝
//        arr2 = new int[arr1.length];
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }

        //修改arr2中的偶索引元素，使其等于索引值（如arr2[0] = 0,arr2[2] = 2）
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 0) {
                arr2[i] = i;
            }
        }

        //显示arr1的内容
        System.out.println("arr1的内容（后）:");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}
