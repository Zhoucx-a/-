package com.zcx.test.busi.JiuJiaAPP.pojo.request.checkstock2;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 21:06
 */
@Data
public class Checkstock2HeadReq {
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
