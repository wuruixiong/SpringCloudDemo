package wrx.sc.scapi;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@NoArgsConstructor
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable { //Dept 实体类  orm  类表关系映射

    private Long dept_no;//主键
    private String dept_name;
    //这个数据数存在哪个数据库的字段~ 微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db;

    public Dept(String dept_name) {
        this.dept_name = dept_name;
    }

    /*
    链式写法：
       Dept dept =  new Dept();

       dept.setDeptNo(11).setDname('ssss').setDb_source('001');

     */


}
