package cn.myfreecloud.bean;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Employee {

    private Integer employeeId;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer departmentId;
    private Date birthday;
}
