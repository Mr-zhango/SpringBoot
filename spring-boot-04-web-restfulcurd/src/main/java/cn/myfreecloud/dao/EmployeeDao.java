package cn.myfreecloud.dao;

import cn.myfreecloud.entities.Employee;
import cn.myfreecloud.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class EmployeeDao{

	/**
     * 注入员工
     */
	@Autowired
	private EmployeeMapper employeeMapper;

    /**
     * 添加员工
     * @param employee  员工实体
     * @return
     */
    public Integer add(Employee employee){
        return employeeMapper.insertEmp(employee);
    }

    /**
     * 删除员工
     * @param id
     * @return
     */
    public void delete(Integer id){
        employeeMapper.deleteEmpById(id);
    }

    /**
     * 修改员工
     * @return
     */
    public void updateEmp(Employee employee){
        employeeMapper.updateEmpById(employee);
    }

    /**
     * 查询员工
     * @param id
     * @return
     */
    public Employee get(Integer id){
        return employeeMapper.getEmpById(id);
    }

    /**
     * 查询所有的员工
     * @return
     */
	public List<Employee> getAll(){
		return employeeMapper.getAllEmp();
	}



}
