package com.lucas.dao;

import com.lucas.dto.User;

import java.util.List;

/**
 * @author lucas
 * @date 2020/11/18
 */
public interface UserMapper {

    List<User> getUserList();
}
