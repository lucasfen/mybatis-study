package com.lucas.dto;

import lombok.Data;

import java.util.List;

/**
 * @author lucas
 * @create 2020/11/22
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> studentList;
}
