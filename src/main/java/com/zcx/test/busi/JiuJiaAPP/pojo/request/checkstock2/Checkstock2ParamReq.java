package com.zcx.test.busi.JiuJiaAPP.pojo.request.checkstock2;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 21:06
 */
@Data
public class Checkstock2ParamReq {
    @ApiModelProperty(value = "id", dataType = "String", position = 1)
    private String id;
}
