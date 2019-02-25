package cn.myfreecloud.controller;

import cn.myfreecloud.bean.Department;
import cn.myfreecloud.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 不返回页面,只返回json数据
 */
@RestController
public class DeptController {




    @Autowired
    DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){

        Department department = departmentMapper.getDeptById(id);
        return department;
    }


    /**
     * 插入部门
     * @param department
     * @return
             */
    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }


}
