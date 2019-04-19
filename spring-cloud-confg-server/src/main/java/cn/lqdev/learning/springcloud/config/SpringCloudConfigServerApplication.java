package cn.lqdev.learning.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableConfigServer
@Slf4j
public class SpringCloudConfigServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
		log.info("spring-cloud-config-server启动!");
	}
}