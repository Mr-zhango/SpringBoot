package cn.myfreecloud.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Employee{

	private Integer employeeId;
    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private Integer departmentId;
    private Date birthday;
}
