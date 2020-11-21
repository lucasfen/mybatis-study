package com.lucas.dao;

import com.lucas.dto.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lucas
 * @create 2020/11/22
 */
public interface TeacherMapper {

    @Select("select * from teacher where id=#{tid}")
    Teacher getTeacher(@Param("tid") int id);
}
