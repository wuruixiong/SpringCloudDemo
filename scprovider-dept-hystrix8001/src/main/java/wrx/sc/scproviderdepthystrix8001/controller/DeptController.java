package wrx.sc.scproviderdepthystrix8001.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import wrx.sc.scapi.Dept;
import wrx.sc.scproviderdepthystrix8001.service.DeptService;

//提供Restful服务！
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);

        if (dept==null){
            throw new RuntimeException("id=>"+id+"，不存在该用户，或者信息无法找到~");
        }

        return dept;
    }

    //备选方法
    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept()
                .setDept_no(id)
                .setDept_name("id=>"+id+"没有对应的信息，null--@Hystrix")
                .setDb("no this database in MySQL");
    }

}
