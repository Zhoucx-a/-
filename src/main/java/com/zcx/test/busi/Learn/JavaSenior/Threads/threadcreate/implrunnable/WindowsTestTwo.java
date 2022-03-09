package com.zcx.test.busi.Learn.JavaSenior.Threads.threadcreate.implrunnable;

/**
 * <p>
 * 创建三个窗口卖票，总票数为100（使用实现Runnable接口的方式实现）
 * </p>
 *
 * @author : Yuki Judai 2022/3/8 16:26
 */
public class WindowsTestTwo {
    public static void main(String[] args) {
        WindowTwo window = new WindowTwo();

        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class WindowTwo implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
