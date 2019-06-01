package cn.myfreecloud.cache.controller;

import cn.myfreecloud.cache.bean.Employee;
import cn.myfreecloud.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangyang
 * @date: 2019/5/31 15:04
 * @description:
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){

        Employee emp = employeeService.getEmp(id);
        return emp;
    }


    /**
     * 更新员工信息
     * @param employee
     * @return
     */
    @GetMapping("/emp")
    public Employee update(Employee employee){
        Employee emp = employeeService.updateEmp(employee);

        return emp;
    }

    /**
     * 根据id删除员工
     * @param id
     * @return
     */
    @GetMapping("/delemp")
    public String deleteEmp(Integer id){
        employeeService.deleteEmp(id);
        return "success";
    }

    /**
     * 根据名字获取用户
     * @param lastName
     * @return
     */
    @GetMapping("/emp/lastname/{lastName}")
    public Employee getEmpByLastName(@PathVariable("lastName") String lastName){
        return employeeService.getEmpByLastName(lastName);
    }
}
