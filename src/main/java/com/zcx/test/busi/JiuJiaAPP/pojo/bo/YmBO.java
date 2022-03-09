package com.zcx.test.busi.JiuJiaAPP.pojo.bo;

import lombok.Data;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 21:02
 */
@Data
public class YmBO<T, S> {
    private T webheaders;

    private S param;
}
