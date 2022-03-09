package com.zcx.test.busi.JiuJiaAPP.pojo.request.subscribe;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 21:24
 */
@Data
public class SubscribeHeadReq {
    @ApiModelProperty(value = "eccHs", dataType = "String", position = 1)
    private String eccHs;

    @ApiModelProperty(value = "tk", dataType = "String", position = 2)
    private String tk;

    @ApiModelProperty(value = "userCookie", dataType = "String", position = 3)
    private String userCookie;

    @ApiModelProperty(value = "userAgent", dataType = "String", position = 4)
    private String userAgent;

    @ApiModelProperty(value = "referer", dataType = "String", position = 5)
    private String referer;

    @ApiModelProperty(value = "accept", dataType = "String", position = 6)
    private String accept;

    @ApiModelProperty(value = "host", dataType = "String", position = 7)
    private String host;
}
