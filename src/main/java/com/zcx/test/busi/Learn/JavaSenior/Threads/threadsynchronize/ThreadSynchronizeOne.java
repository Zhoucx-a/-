package com.zcx.test.busi.Learn.JavaSenior.Threads.threadsynchronize;

/**
 * <p>
 * 创建三个窗口卖票，总票数为100（使用实现Runnable接口的方式实现）
 * </p>
 *
 * <p>
 * 问题：
 * 卖票过程中，出现了重票、错票 ——>出现了线程的安全问题
 * 问题出现的原因：
 * 当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 * 如何解决：
 * 当一个线程a在操作ticket的时候，其他线程不能参与进来，直到线程a操作完ticket时，其他线程才可以操作ticket。
 * 这种情况即使线程a出现了阻塞，也不能被改变。
 * <p>
 * 在Java中，我们通过同步机制，来解决线程安全问题
 * <p>
 * 方式一：同步代码块
 * synchronized(同步监视器){
 * //需要被同步的代码
 * }
 * 说明：操作共享数据的代码，即为需要被同步的代码  -->不能包含代码多了，也不能包含代码少了
 * 共享数据：多个线程共同操作的变量（数据）。比如：ticket就是共享数据
 * 同步监视器：俗称：锁。任何一个类的对象，都可以充当锁
 * ※要求：多个线程必须要公用同一把锁
 * <p>
 * 补充:在实现Runnable接口创建多线程的方式,我们可以考虑使用this充当同步监视器
 * 在继承Thread类创建多线程的方式中，慎用this充当同步监视器，可以考虑使用当前类充当同步监视器
 * 方式二：同步方法
 *
 *
 * </p>
 * <p>
 * 同步的方式，解决了线程的安全问题（好处）
 * 操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低（局限性）
 * </p>
 *
 * @author : Yuki Judai 2022/3/9 13:35
 */
public class ThreadSynchronizeOne {
    public static void main(String[] args) {
        Window window = new Window();

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

class Window implements Runnable {

    private int ticket = 100;

//    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //此时的this:唯一的Window的对象
//            synchronized (this) {
            synchronized (Window.class) {
//            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}