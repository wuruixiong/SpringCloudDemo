package wrx.sc.scconsumerdept80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"wrx.sc.scconsumerdept80"})
//@ComponentScan("wrx.sc.scconsumerdept80")
public class SCConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(SCConsumerDept80Application.class, args);
    }

}
