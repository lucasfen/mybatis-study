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

        sqlSession.close();
    }
}
