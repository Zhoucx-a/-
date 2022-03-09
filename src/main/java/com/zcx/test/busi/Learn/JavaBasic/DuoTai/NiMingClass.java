package com.zcx.test.busi.Learn.JavaBasic.DuoTai;

/**
 * 匿名子类
 *
 * @author : Yuki Judai 2022/3/3 9:44
 */
public class NiMingClass {
    public static void main(String[] args) {
        method(new Person() {
            @Override
            public void work() {
                System.out.println("测试一下！");
            }
        });
    }

    public static void method(Person p) {
        p.work();
    }
}

class Person {
    public void work() {
        System.out.println("123");
    }
}

class student extends Person {
    public void work() {
        System.out.println("好好学习！");
    }
}