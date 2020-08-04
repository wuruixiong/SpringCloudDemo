package wrx.sc.configclient3355;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import wrx.sc.configclient3355.myrule.KuangRule;

@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候就能去加载我们自定义Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = KuangRule.class)
public class SCConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(SCConsumerDept80Application.class, args);
    }

}
