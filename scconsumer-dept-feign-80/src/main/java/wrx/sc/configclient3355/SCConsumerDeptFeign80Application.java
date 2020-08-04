package wrx.sc.configclient3355;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"wrx.sc.configclient3355"})
//@ComponentScan("wrx.sc.scconsumerdept80")
public class SCConsumerDeptFeign80Application {

    public static void main(String[] args) {
        SpringApplication.run(SCConsumerDeptFeign80Application.class, args);
    }

}
