package com.zcx.test.busi.JiuJiaAPP.pojo.request.submitDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 21:46
 */
@Data
public class SubmitDateTimeParamReq {
    @ApiModelProperty(value = "id", dataType = "String", position = 1)
    private String id;

    @ApiModelProperty(value = "sid", dataType = "String", position = 2)
    private String sid;

    @ApiModelProperty(value = "day", dataType = "String", position = 3)
    private String day;

    @ApiModelProperty(value = "wid", dataType = "String", position = 4)
    private String wid;
}
