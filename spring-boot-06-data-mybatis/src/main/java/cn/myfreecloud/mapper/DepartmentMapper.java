package cn.myfreecloud.mapper;

import cn.myfreecloud.bean.Department;

import java.util.List;

/**
 * 指定这是一个操作数据库的mapper
 */
public interface DepartmentMapper {

    /**
     * 插入部门
     * @param department
     * @return
     */
    public int insertDept(Department department);


    /**
     * 删除部门
     * @param id
     * @return
     */
    public void deleteDet(Integer id);

    /**
     * 修改部门信息
     * @param department
     * @return
     */
    public Department updateDet(Department department);


    /**
     * 查询部门信息
     * @param id
     * @return
     */
    public Department getDeptById(Integer id);

    /**
     * 查询部门信息
     * @param
     * @return
     */
    public List<Department> getAllDept();

}
