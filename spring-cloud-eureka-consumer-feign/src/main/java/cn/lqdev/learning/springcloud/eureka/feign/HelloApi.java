package cn.lqdev.learning.springcloud.eureka.feign;

import org.springframework.cloud.openfeign.FeignClient;

import cn.lqdev.learning.springcloud.eureka.api.IHelloApi;

/**
 * 直接继承接口
 * @author Okong
 *
 */
@FeignClient(name = IHelloApi.SERVICE_NAME)
public interface HelloApi extends IHelloApi{

}