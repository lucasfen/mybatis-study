package com.lucas.dao;

import com.lucas.dto.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author lucas
 * @create 2020/11/22
 */
public interface TeacherMapper {

    Teacher getTeacher(@Param("tid") int id);
}
