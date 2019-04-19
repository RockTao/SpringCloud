package cn.lqdev.learning.springcloud.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/")
    public String index() {
        return "spring-cloud-eureka-client!";
    }
//    @Autowired
//    LoadBalancerClient loadBalancerClient;
//    
//    @Autowired 
//    RestTemplate restTemplate;
//    
//    @GetMapping("/hello") 
//    public String hello(String name) {
//        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
//        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello?name=" + name;
//        log.info("url地址为：{}", url);
//        return restTemplate.getForObject(url, String.class);
//    } 
    
    
    @GetMapping("/hello")
    public String index(String name) {
    	log.info("spring-cloud-eureka-client!服务呗调用了,参数name = " + name);
    	return name +", this is a spring-cloud-eureka-client! ";
    }
}
