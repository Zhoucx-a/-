package com.zcx.test.busi.Learn.JavaBasic.BiaoShiJieKou;

import java.lang.reflect.Field;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2022/1/4 17:14
 */
public class LoggerUtil {
    public static void printWithoutCupInfo(Object object) throws IllegalAccessException {
        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object filedValue = field.get(object);
            if (filedValue instanceof NotPrint) {
                continue;
            }
            System.out.println(field.getName() + ":" + filedValue);
        }
    }
}
