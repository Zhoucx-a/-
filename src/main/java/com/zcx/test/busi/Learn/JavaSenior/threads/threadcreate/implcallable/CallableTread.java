package com.zcx.test.busi.Learn.JavaSenior.threads.threadcreate.implcallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三：实现Callable接口的方式(JDK 5.0新增)
 * <p>
 * 如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程要强大？
 * 1. call方法可以有返回值
 * 2. call方法可以抛出异常，被外面的操作捕获，获取异常的信息
 * 3. Callable支持泛型
 * </p>
 *
 * @author : Yuki Judai 2022/3/10 13:21
 */
public class CallableTread {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread numThread = new NumThread();

        //4.将此Callable实现类的对象作为参数传递到FutureTask构造器中，创建GutureTask的对象
        FutureTask<Integer> futureTask = new FutureTask<>(numThread);

        //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        //FutureTask实现类Runnable接口
        new Thread(futureTask).start();

        try {
            //6.获取Callable中的call方法的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call方法的返回值
            Integer sum = futureTask.get();
            System.out.println("总和为:" + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}

//1.创建一个实现Callable的实现类
class NumThread implements Callable<Integer> {

    //2.实现call方法,将此线程需要执行的操作声明在call方法中
    @Override
    public Integer call() throws Exception {
        int sum = 0;

        //遍历100以内的偶数
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }

        return sum;
    }
}