package com.zcx.test.busi.Learn.DesignModel.singleton;

/**
 * 设计模式——单例模式(懒汉式)
 *
 * @author : Yuki Judai 2022/3/2 9:29
 */
public class LazyManSingleton {
    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();

        System.out.println(o1 == o2);
    }
}

class Order {
    //1.私有化类的构造器
    private Order() {
    }

    //2.声明当前类对象，没有初始化
    //4.要求此对象也必须声明为静态的
    private static Order instance;

    //3.声明public、static的返回当前类对象的方法
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}
