package wrx.sc.configclient3355.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KuangRule {

    @Bean
    public IRule myRule(){
        return new KuangRandomRule();
        //return new RoundRobinRule(); //默认是轮询，现在我们定义为~ KuangRandomRule
    }

}
