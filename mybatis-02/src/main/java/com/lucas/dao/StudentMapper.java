package com.lucas.dao;

import com.lucas.dto.Student;

import java.util.List;

/**
 * @author lucas
 * @create 2020/11/22
 */
public interface StudentMapper {

    //查询所有的学生信息，以及对应的老师的信息
    public List<Student> getStudent();
}
