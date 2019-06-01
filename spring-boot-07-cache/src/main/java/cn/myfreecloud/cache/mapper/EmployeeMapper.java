package cn.myfreecloud.cache.mapper;

import cn.myfreecloud.cache.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @author: zhangyang
 * @date: 2019/5/31 14:57
 * @description:
 */
@Mapper
public interface EmployeeMapper {
    /**
     * 查询员工:id
     * @param id
     * @return
     */
    @Select("SELECT * FROM employee WHERE id = #{id}")
    public Employee getEmpById(Integer id);

    /**
     * 更新员工
     * @param employee
     */
    @Update("UPDATE employee SET lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} WHERE id=#{id}")
    public void updateEmp(Employee employee);

    /**
     * 删除员工
     * @param id
     */
    @Delete("DELETE FROM employee WHERE id=#{id}")
    public void deleteEmpById(Integer id);

    /**
     * 插入员工
     * @param employee
     */
    @Insert("INSERT INTO employee(lastName,email,gender,d_id) VALUES(#{lastName},#{email},#{gender},#{dId})")
    public void insertEmployee(Employee employee);

    /**
     * 查询员工:lastName
     * @param lastName
     * @return
     */
    @Select("SELECT * FROM employee WHERE lastName = #{lastName}")
    Employee getEmpByLastName(String lastName);
}
