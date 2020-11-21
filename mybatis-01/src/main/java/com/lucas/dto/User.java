package com.lucas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author: lucas
 * @date: 2020/11/18
 */
@Data
@ToString
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
