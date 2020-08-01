package wrx.sc.scproviderdepthystrix8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //在服务启动后自动注册到Eureka中！
//@EnableDiscoveryClient //服务发现~
@EnableCircuitBreaker //添加对熔断的支持
public class SCProviderDeptHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SCProviderDeptHystrix8001Application.class, args);
    }

}
