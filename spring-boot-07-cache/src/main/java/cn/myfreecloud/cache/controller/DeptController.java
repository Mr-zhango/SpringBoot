package cn.myfreecloud.cache.controller;

import cn.myfreecloud.cache.bean.Department;
import cn.myfreecloud.cache.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangyang
 * @date: 2019/6/1 11:35
 * @description:
 */
@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    /**
     * 查询部门
     * @param id
     * @return
     */
    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        return deptService.getDeptById(id);
    }
}
