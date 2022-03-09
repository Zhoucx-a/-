package com.zcx.test.busi.JiuJiaAPP.pojo.request.submitDateTime;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 21:45
 */
@Data
public class SubmitDateTimeHeadReq {
    @ApiModelProperty(value = "tk", dataType = "String", position = 1)
    private String tk;

    @ApiModelProperty(value = "userCookie", dataType = "String", position = 2)
    private String userCookie;

    @ApiModelProperty(value = "userAgent", dataType = "String", position = 3)
    private String userAgent;

    @ApiModelProperty(value = "referer", dataType = "String", position = 4)
    private String referer;

    @ApiModelProperty(value = "accept", dataType = "String", position = 5)
    private String accept;

    @ApiModelProperty(value = "host", dataType = "String", position = 6)
    private String host;
}
