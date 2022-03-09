package com.zcx.test.busi.Learn.JavaBasic.Object;

import java.util.Objects;

/**
 * 重写Object类 equals()
 *
 * @author : Yuki Judai 2022/2/28 11:10
 */
public class EqualsTest {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(1);

        System.out.println(p1.equals(p2));
    }
}

class Person {
    /**
     * 自动生成的equals
     *
     * @param o 被比较的对象
     * @return true/false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    private int age;

    Person(int age) {
        this.age = age;
    }

//    /**
//     * 手写的equals
//     *
//     * @param obj 被比较的对象
//     * @return true/false
//     */
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj instanceof Person) {
//            return this.age == ((Person) obj).age;
//        }
//
//        return false;
//    }
}