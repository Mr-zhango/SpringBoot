package cn.myfreecloud.cache.bean;

import java.io.Serializable;

/**
 * @author: zhangyang
 * @date: 2019/5/31 14:34
 * @description:
 */
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String departmentName;


    public Department() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Department(Integer id, String departmentName) {
        super();
        this.id = id;
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", departmentName=" + departmentName + "]";
    }


}
