package com.lucas.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author lucas
 * @create 2020/11/22
 */
@Data
@Alias("student")
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
