package com.lucas.dao;

import com.lucas.dto.User;
import com.lucas.utils.MybaitsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author lucas
 * @date 2020/11/18
 */
public class UserMapperTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybaitsUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }

        User user = mapper.getUserById(1);

        mapper.addUser(new User(2, "lucasfen", "123456"));

        mapper.updateUser(new User(2, "fqh", "123"));

        mapper.deleteUser(1);

        sqlSession.commit();
        sqlSession.close();
    }
}
