package cn.myfreecloud.mapper;


import cn.myfreecloud.bean.Employee;

public interface EmployeeMapper {


    /**
     * 新增员工
     * @param employee
     * @return
     */
    public Integer insertEmp(Employee employee);


    /**
     * 删除员工
     * @param employee
     * @return
     */
    public void deleteEmp(Employee employee);

    /**
     * 修改员工
     * @param employee
     * @return
     */
    public Integer updateEmp(Employee employee);

    /**
     * 查询员工
     * @param id
     * @return
     */
    public Employee getEmpById(Integer id);

}
