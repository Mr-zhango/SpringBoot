package cn.myfreecloud.controller;

import cn.myfreecloud.entities.Department;
import cn.myfreecloud.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    //查询所有员工返回列表页面
    @GetMapping("/depts")
    @ResponseBody
    public Object  list(Model model){
        List<Department> departmentList = departmentMapper.getAllDept();
        Map<String, Object> resMap = new HashMap<>();

        return departmentList;
    }

}
