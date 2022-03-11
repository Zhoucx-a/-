package com.zcx.test.busi.Learn.JavaSenior.threads.threadlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三：Lock锁   ——JDK 5.0新增
 *
 * @author : Yuki Judai 2022/3/10 9:20
 */
public class LockTest {
    public static void main(String[] args) {
        WindowLock windowLock = new WindowLock();

        Thread t1 = new Thread(windowLock);
        Thread t2 = new Thread(windowLock);
        Thread t3 = new Thread(windowLock);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class WindowLock implements Runnable {

    private int ticket = 100;

    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            try {
                //2.调用锁定方法：lock()
                lock.lock();

                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //调用解锁方法：unlock()
                lock.unlock();
            }


        }
    }
}