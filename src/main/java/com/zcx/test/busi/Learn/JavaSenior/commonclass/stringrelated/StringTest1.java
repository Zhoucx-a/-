package com.zcx.test.busi.Learn.JavaSenior.commonclass.stringrelated;

/**
 * 关于String的一道面试题
 *
 * @author : Yuki Judai 2022/3/11 11:20
 */
public class StringTest1 {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest1 ex = new StringTest1();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }
}