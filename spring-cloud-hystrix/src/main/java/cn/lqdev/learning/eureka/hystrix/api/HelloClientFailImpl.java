package cn.lqdev.learning.eureka.hystrix.api;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component("fallback")
@Slf4j
public class HelloClientFailImpl implements IHelloClient{
	
	@Override
	public String hello(String name) {
    	log.error("restTemplate调用[hello]服务发生异常，参数name:{}", name);
		return "restTemplate调用[hello]服务发异常，参数name:" + name;
	}
}