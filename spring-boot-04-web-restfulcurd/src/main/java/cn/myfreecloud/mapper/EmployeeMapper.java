package cn.myfreecloud.mapper;


import cn.myfreecloud.entities.Employee;

import java.util.List;

public interface EmployeeMapper {

    /**
     * 插入员工的方法
     * @param employee
     * @return
     */
    public Integer insertEmp(Employee employee);

    /**
     * 删除员工的方法
     * @param id
     * @return
     */
    public void deleteEmpById(Integer id);

    /**
     * 修改员工的方法
     * @param employee
     * @return
     */
    public void updateEmpById(Employee employee);

    /**
     * 查询员工方法
     * @param id 员工id
     * @return
     */
    public Employee getEmpById(Integer id);

    /**
     * 查询所有员工方法
     * @param
     * @return
     */
    public List<Employee> getAllEmp();

}
