package cn.lqdev.learning.springcloud.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.lqdev.learning.springcloud.eureka.api.IHelloApi;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HelloApiImpl implements IHelloApi {
	
	@Override
	public String helloApi(@RequestParam("name") String name) {
		log.info("[spring-cloud-eureka-client]服务[helloApi]被调用，参数name值为：{}", name);
		return name + ",helloApi调用!";
	}
}