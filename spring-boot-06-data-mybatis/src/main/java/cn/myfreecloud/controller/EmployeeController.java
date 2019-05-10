package cn.myfreecloud.controller;

//import cn.myfreecloud.api.EmployeeApi;

import cn.myfreecloud.bean.Employee;
import cn.myfreecloud.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 不返回页面,只返回json数据
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;


    /**
     * 根据id查询员工
     * @param id
     * @return
     */
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){

        return employeeMapper.getEmpById(id);
    }

    /**
     * 插入员工
     * @param employee
     * @return Integer
     */
    @PostMapping("/emp")
    public Integer insertEmp(Employee employee){
        return employeeMapper.insertEmp(employee);
    }

}
