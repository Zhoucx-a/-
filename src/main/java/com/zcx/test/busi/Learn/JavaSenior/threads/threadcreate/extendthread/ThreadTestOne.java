package com.zcx.test.busi.Learn.JavaSenior.threads.threadcreate.extendthread;

/**
 * 创建多线程的方式一: 继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()方法 --> 将此线程执行的操作声明在run()中
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用Thread类的start()方法
 * 例子：遍历100以内所有的偶数
 *
 * @author : Yuki Judai 2022/3/8 11:40
 */
public class ThreadTestOne {
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyThread myThread = new MyThread();

        /*
         * 4.通过此对象调用Thread类的start()方法
         *
         * start()：①启动当前线程 ② 调用当前线程的run()
         */
        myThread.start();

        //问题一：我们不能通过直接调用run()的方式启动线程
//        myThread.run();
        //问题二：再启动一个线程，遍历100以内的偶数。不可以还让已经start（）的线程去执行，会报 IllegalThreadStateException 异常
        //创建Thread的匿名子类的方式
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + "：" + i);
                    }
                }
            }
        };


        //如下操作仍然是在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        }
    }
}

//1.创建一个继承于Thread类的子类
class MyThread extends Thread {

    //2.重写Thread类的run()方法 --> 将此线程执行的操作声明在run()中
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        }
    }
}