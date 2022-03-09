package com.zcx.test.framework.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>${description}</p>
 *
 * @author : Yuki Judai 2021/12/2 14:20
 */
@Slf4j
public class FeignConfig implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        log.info("请求头信息:" + template);
    }
}
