package com.zcx.test.busi.Learn.JavaBasic.DaiMaKuai;

/**
 * 代码块执行顺序测试
 *
 * @author : Yuki Judai 2022/3/2 11:09
 */
public class test {
    public static void main(String[] args) {
        System.out.println("777");
        new Son();
    }
}

class Father {
    static {
        System.out.println("111");
    }

    {
        System.out.println("222");
    }

    public Father() {
        System.out.println("333");
    }
}

class Son extends Father {
    static {
        System.out.println("444");
    }

    {
        System.out.println("555");
    }

    public Son(){
        System.out.println("666");
    }

//    public static void main(String[] args) {
//        System.out.println("777");
//        new Son();
//    }
}