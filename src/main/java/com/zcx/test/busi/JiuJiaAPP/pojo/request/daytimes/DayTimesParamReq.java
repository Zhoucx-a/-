package com.zcx.test.busi.JiuJiaAPP.pojo.request.daytimes;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 21:44
 */
@Data
public class DayTimesParamReq {
    @ApiModelProperty(value = "id", dataType = "String", position = 1)
    private String id;

    @ApiModelProperty(value = "sid", dataType = "String", position = 2)
    private String sid;

    @ApiModelProperty(value = "day", dataType = "String", position = 3)
    private String day;
}
