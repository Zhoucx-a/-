package com.zcx.test.busi.Learn.DesignModel.singleton;

/**
 * 设计模式——单例模式(饿汉式)
 *
 * @author : Yuki Judai 2022/3/2 9:21
 */
public class HungryManSingleton {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();

        System.out.println(b1 == b2);
    }
}

class Bank {
    //1.私有化类的构造器
    private Bank() {
    }

    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank();

    //3.提供公共方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }
}