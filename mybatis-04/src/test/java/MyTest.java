import com.lucas.dao.BlogMapper;
import com.lucas.utils.MybaitsUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;

/**
 * @author lucas
 * @create 2020/11/23
 */
public class MyTest {

    public void test(){
        SqlSession sqlSession = MybaitsUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        mapper.queryBlogIF(map);
        sqlSession.close();
    }
}
