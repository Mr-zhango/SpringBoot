package cn.myfreecloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@ToString
public class Employee{

	private Integer employeeId;
    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private Integer departmentId;
    private Date birthday;
}
