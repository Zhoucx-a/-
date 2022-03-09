package com.zcx.test.framework.feign;

import com.zcx.test.framework.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * 约苗APP
 *
 * @author : Yuki Judai 2021/12/2 13:57
 */
@FeignClient(name = "YMFeign", url = "${interface.ym.url}", configuration = FeignConfig.class)
@Component
public interface YMFeign {
    /**
     * 获取疫苗剩余量
     */
    @GetMapping(value = "${interface.ym.checkstock2}")
    Object checkstock2(@RequestParam("id") String id,
                       @RequestHeader("Cookie") String cookie, @RequestHeader("User-Agent") String userAgent,
                       @RequestHeader("Host") String host, @RequestHeader("Accept") String accept,
                       @RequestHeader("Referer") String referer, @RequestHeader("tk") String tk);

    /**
     * 获取秒杀资格
     */
    @GetMapping(value = "${interface.ym.subscribe}")
    Object subscribe(@RequestParam("seckillId") String seckillId, @RequestParam("linkmanId") String linkmanId,
                     @RequestParam("idCardNo") String idCardNo, @RequestParam("vaccineIndex") String vaccineIndex,
                     @RequestHeader("ecc-hs") String eccHs, @RequestHeader("tk") String tk,
                     @RequestHeader("Cookie") String cookie, @RequestHeader("User-Agent") String userAgent,
                     @RequestHeader("Referer") String referer, @RequestHeader("Accept") String accept,
                     @RequestHeader("Host") String host);

    /**
     * 获取可预约时间表
     */
    @GetMapping(value = "${interface.ym.subscribeDays}")
    Object subscribeDays(@RequestParam("id") String id, @RequestParam("sid") String sid,
                         @RequestHeader("Cookie") String cookie, @RequestHeader("User-Agent") String userAgent,
                         @RequestHeader("Host") String host, @RequestHeader("Accept") String accept,
                         @RequestHeader("Referer") String referer, @RequestHeader("tk") String tk);

    /**
     * 获取预约时间段
     */
    @GetMapping(value = "${interface.ym.dayTimes}")
    Object dayTimes(@RequestParam("id") String id, @RequestParam("sid") String sid, @RequestParam("day") String day,
                    @RequestHeader("Cookie") String cookie, @RequestHeader("User-Agent") String userAgent,
                    @RequestHeader("Host") String host, @RequestHeader("Accept") String accept,
                    @RequestHeader("Referer") String referer, @RequestHeader("tk") String tk);

    /**
     * 提交预约
     */
    @GetMapping(value = "${interface.ym.submitDateTime}")
    Object submitDateTime(@RequestParam("id") String id, @RequestParam("sid") String sid,
                          @RequestParam("day") String day, @RequestParam("wid") String wid,
                          @RequestHeader("Cookie") String cookie, @RequestHeader("User-Agent") String userAgent,
                          @RequestHeader("Host") String host, @RequestHeader("Accept") String accept,
                          @RequestHeader("Referer") String referer, @RequestHeader("tk") String tk);
}
