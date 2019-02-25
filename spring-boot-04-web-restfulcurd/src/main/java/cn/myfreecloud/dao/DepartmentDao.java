package cn.myfreecloud.dao;

import cn.myfreecloud.entities.Department;
import cn.myfreecloud.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class DepartmentDao {

    /**
     * 注入员工
     */
    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 添加部门
     * @param department
     * @return
     */
    public Integer add(Department department){
        return departmentMapper.insertDept(department);
    }

    /**
     * 删除部门
     * @param id
     * @return
     */
    public void delete(Integer id){
        departmentMapper.deleteDet(id);
    }

    /**
     * 修改部门
     * @return
     */
    public Department updateEmp(Department department){
        return departmentMapper.updateDet(department);
    }

    /**
     * 查询部门
     * @param id
     * @return
     */
    public Department get(Integer id){
        return departmentMapper.getDept(id);
    }

    /**
     * 查询所有的部门
     * @return
     */
    public List<Department> getAll(){
        return departmentMapper.getAllDept();
    }
}
