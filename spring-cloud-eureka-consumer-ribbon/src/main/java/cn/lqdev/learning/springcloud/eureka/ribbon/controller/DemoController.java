package cn.lqdev.learning.springcloud.eureka.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {
    
    @Autowired 
    RestTemplate restTemplate;
    
    @GetMapping("/hello") 
    public String hello(String name) {
    	log.info("-----------------------spring-cloud-eureka-consumer-ribbon--------------------");
        //直接使用服务名进行访问
        log.info("请求参数name:{}", name);
        return restTemplate.getForObject("http://eureka-client/hello?name=" + name, String.class);
    } 
}	