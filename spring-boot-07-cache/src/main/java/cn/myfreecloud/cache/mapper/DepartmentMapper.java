package cn.myfreecloud.cache.mapper;

import cn.myfreecloud.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: zhangyang
 * @date: 2019/5/31 14:40
 * @description:
 */
@Mapper
public interface DepartmentMapper {

    /**
     * 这里使用的是mybatis的注解版实现
     * @param id
     * @return
     */
    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDeptById(Integer id);
}
