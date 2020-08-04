package wrx.sc.configclient3355;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启监控
public class SCDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SCDashboardApplication.class, args);
    }

}
