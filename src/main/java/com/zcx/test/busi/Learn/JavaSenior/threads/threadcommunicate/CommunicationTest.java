package com.zcx.test.busi.Learn.JavaSenior.threads.threadcommunicate;

/**
 * 线程通信的例子:使用两个线程打印1-100，线程1，线程2 交替打印
 * <p>
 * 涉及到的三个方法
 * wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 * notify():一旦执行此方法，就会唤醒被wait的一个线程，如果有多个线程被wait，就唤醒优先级高的那个
 * notifyAll():一旦执行此方法，就会唤醒被wait的所有线程
 * </p>
 * <p>
 * 注意点
 * ※wait()、notify()、notifyAll()这三个方法必须要使用在同步代码块或同步方法中
 * ※三个方法的调用者必须是同步代码块或者同步方法的同步监视器，否则运行报错出现IllegalMonitorStateException异常,
 * 因此这三个方法只能出现在synchronized机制中，不能出现在Lock中
 * ※这三个方法定义在java.lang.Object类当中（同步监视器可以是任何一个对象，那这三个方法也要保证任何一个对象都能调用）
 * </p>
 *
 * @author : Yuki Judai 2022/3/10 10:00
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class Number implements Runnable {

    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                //新进入的线程唤醒旧线程
                notify();

                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //使得调用如下wait()的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}