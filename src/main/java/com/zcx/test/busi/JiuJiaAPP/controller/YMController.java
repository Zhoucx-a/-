package com.zcx.test.busi.JiuJiaAPP.controller;

import com.zcx.test.busi.JiuJiaAPP.pojo.bo.YmBO;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.checkstock2.Checkstock2HeadReq;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.checkstock2.Checkstock2ParamReq;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.daytimes.DayTimesHeadReq;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.daytimes.DayTimesParamReq;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.submitDateTime.SubmitDateTimeHeadReq;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.submitDateTime.SubmitDateTimeParamReq;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.subscribe.SubscribeHeadReq;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.subscribe.SubscribeParamReq;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.subscribedays.SubscribeDaysHeadReq;
import com.zcx.test.busi.JiuJiaAPP.pojo.request.subscribedays.SubscribeDaysParamReq;
import com.zcx.test.framework.feign.YMFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 13:57
 */
@RestController
@RequestMapping("ym")
@Slf4j
@Api(tags = "约苗")
public class YMController {
    @Resource
    private YMFeign ymFeign;

    @ApiOperation(value = "获取疫苗剩余量", httpMethod = "POST")
    @PostMapping("checkstock2")
    public Object checkstock2(@RequestBody YmBO<Checkstock2HeadReq, Checkstock2ParamReq> checkstock2ReqInfo) {
        Checkstock2HeadReq checkstock2HeadReq = checkstock2ReqInfo.getWebheaders();
        Checkstock2ParamReq checkstock2ParamReq = checkstock2ReqInfo.getParam();

        Object out = ymFeign.checkstock2(
                checkstock2ParamReq.getId(), checkstock2HeadReq.getUserCookie(),
                checkstock2HeadReq.getUserAgent(), checkstock2HeadReq.getHost(),
                checkstock2HeadReq.getAccept(), checkstock2HeadReq.getReferer(),
                checkstock2HeadReq.getTk());
        log.info("获取疫苗剩余量返回信息:" + out);
        return out;
    }

    @ApiOperation(value = "获取秒杀资格", httpMethod = "POST")
    @PostMapping("subscribe")
    public Object subscribe(@RequestBody YmBO<SubscribeHeadReq, SubscribeParamReq> subscribeReqInfo) {
        SubscribeHeadReq subscribeHeadReq = subscribeReqInfo.getWebheaders();
        SubscribeParamReq subscribeParamReq = subscribeReqInfo.getParam();

        Object out = ymFeign.subscribe(
                subscribeParamReq.getSeckillId(), subscribeParamReq.getLinkmanId(),
                subscribeParamReq.getIdCardNo(), subscribeParamReq.getVaccineIndex(),
                subscribeHeadReq.getEccHs(), subscribeHeadReq.getTk(),
                subscribeHeadReq.getUserCookie(), subscribeHeadReq.getUserAgent(),
                subscribeHeadReq.getReferer(), subscribeHeadReq.getAccept(), subscribeHeadReq.getHost());
        log.info("获取秒杀资格返回信息:" + out);
        return out;
    }

    @ApiOperation(value = "获取可预约时间表", httpMethod = "POST")
    @PostMapping("subscribeDays")
    public Object subscribeDays(@RequestBody YmBO<SubscribeDaysHeadReq, SubscribeDaysParamReq> subscribeDaysReqInfo) {
        SubscribeDaysHeadReq subscribeDaysHeadReq = subscribeDaysReqInfo.getWebheaders();
        SubscribeDaysParamReq subscribeDaysParamReq = subscribeDaysReqInfo.getParam();

        Object out = ymFeign.subscribeDays(subscribeDaysParamReq.getId(), subscribeDaysParamReq.getSid(),
                subscribeDaysHeadReq.getUserCookie(), subscribeDaysHeadReq.getUserAgent(),
                subscribeDaysHeadReq.getHost(), subscribeDaysHeadReq.getAccept(),
                subscribeDaysHeadReq.getReferer(), subscribeDaysHeadReq.getTk());
        log.info("获取可预约时间表返回信息:" + out);
        return out;
    }

    @ApiOperation(value = "获取预约时间段", httpMethod = "POST")
    @PostMapping("dayTimes")
    public Object dayTimes(@RequestBody YmBO<DayTimesHeadReq, DayTimesParamReq> dayTimesReqInfo) {
        DayTimesHeadReq dayTimesHeadReq = dayTimesReqInfo.getWebheaders();
        DayTimesParamReq dayTimesParamReq = dayTimesReqInfo.getParam();

        Object out = ymFeign.dayTimes(dayTimesParamReq.getId(), dayTimesParamReq.getSid(), dayTimesParamReq.getDay(),
                dayTimesHeadReq.getUserCookie(), dayTimesHeadReq.getUserAgent(),
                dayTimesHeadReq.getHost(), dayTimesHeadReq.getAccept(),
                dayTimesHeadReq.getReferer(), dayTimesHeadReq.getTk());
        log.info("获取预约时间段返回信息:" + out);
        return out;
    }

    @ApiOperation(value = "提交预约", httpMethod = "POST")
    @PostMapping("submitDateTime")
    public Object submitDateTime(@RequestBody YmBO<SubmitDateTimeHeadReq, SubmitDateTimeParamReq> submitDateTimeReqInfo) {
        SubmitDateTimeHeadReq submitDateTimeHeadReq = submitDateTimeReqInfo.getWebheaders();
        SubmitDateTimeParamReq submitDateTimeParamReq = submitDateTimeReqInfo.getParam();

        Object out = ymFeign.submitDateTime(submitDateTimeParamReq.getId(), submitDateTimeParamReq.getSid(),
                submitDateTimeParamReq.getDay(), submitDateTimeParamReq.getWid(),
                submitDateTimeHeadReq.getUserCookie(), submitDateTimeHeadReq.getUserAgent(),
                submitDateTimeHeadReq.getHost(), submitDateTimeHeadReq.getAccept(),
                submitDateTimeHeadReq.getReferer(), submitDateTimeHeadReq.getTk());
        log.info("提交预约返回信息:" + out);
        return out;
    }
}
