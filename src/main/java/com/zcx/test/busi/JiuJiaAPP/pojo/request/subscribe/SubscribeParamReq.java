package com.zcx.test.busi.JiuJiaAPP.pojo.request.subscribe;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 21:29
 */
@Data
public class SubscribeParamReq {
    @ApiModelProperty(value = "seckillId", dataType = "String", position = 1)
    private String seckillId;

    @ApiModelProperty(value = "linkmanId", dataType = "String", position = 2)
    private String linkmanId;

    @ApiModelProperty(value = "idCardNo", dataType = "String", position = 3)
    private String idCardNo;

    @ApiModelProperty(value = "vaccineIndex", dataType = "String", position = 4)
    private String vaccineIndex;
}
