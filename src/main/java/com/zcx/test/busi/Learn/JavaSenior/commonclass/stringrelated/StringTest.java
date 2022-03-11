package com.zcx.test.busi.Learn.JavaSenior.commonclass.stringrelated;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2022/3/11 11:10
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s4 == s5);//false
        System.out.println(s3 == s6);//true

    }
}
