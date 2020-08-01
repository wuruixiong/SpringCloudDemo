package wrx.sc.scproviderdepthystrix8001.service;

import java.util.List;
import wrx.sc.scapi.Dept;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();

}
