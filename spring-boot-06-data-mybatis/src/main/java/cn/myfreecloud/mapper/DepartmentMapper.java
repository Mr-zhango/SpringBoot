package cn.myfreecloud.mapper;

import cn.myfreecloud.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * 指定这是一个操作数据库的mapper
 */
@Mapper
public interface DepartmentMapper {


    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    @Select("select * from department where DEPARTMENT_ID=#{id}")
    public Department getDeptById(Integer id);


    @Delete("delete from department where DEPARTMENT_ID=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "DEPARTMENT_ID")
    @Insert("insert into department(DEPARTMENT_NAME) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{DEPARTMENT_NAME} where id=#{id}")
    public int updateDept(Department department);
}
