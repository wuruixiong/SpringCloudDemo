package wrx.sc.scproviderdept8001.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import wrx.sc.scapi.Dept;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);  

    public Dept queryById(Long id);

    public List<Dept> queryAll();

}
