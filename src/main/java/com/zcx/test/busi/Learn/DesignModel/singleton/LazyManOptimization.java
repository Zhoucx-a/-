package com.zcx.test.busi.Learn.DesignModel.singleton;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 * @author : Yuki Judai 2022/3/9 16:30
 */
public class LazyManOptimization {
    public static void main(String[] args) {

    }
}

class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    public static Bank getInstance() {
        //方式一:效率略差
//        synchronized (Bank.class){
//            if (instance == null) {
//                instance = new Bank();
//            }
//        }

        //方式二:效率更高
        if (instance == null){
            synchronized (Bank.class){
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }

        return instance;
    }
}