package wrx.sc.sczuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SczuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SczuulApplication.class, args);
    }

}
