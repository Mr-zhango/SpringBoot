package cn.myfreecloud.mapper;

import cn.myfreecloud.entities.Department;

import java.util.List;

public interface DepartmentMapper {
    /**
     * 插入部门
     * @param department
     * @return
     */
    public Integer insertDept(Department department);

    /**
     * 删除部门
     * @param id
     * @return
     */
    public void deleteDet(Integer id);


    /**
     * 修改部门
     * @param department 部门信息
     * @return
     */
    public Department updateDet(Department department);

    /**
     * 查询部门
     * @param id 员工id
     * @return
     */
    public Department getDept(Integer id);

    /**
     * 查询所有的部门
     * @param
     * @return
     */
    public List<Department> getAllDept();
}
