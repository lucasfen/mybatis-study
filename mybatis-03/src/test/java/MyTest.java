import com.lucas.dao.TeacherMapper;
import com.lucas.dto.Teacher;
import com.lucas.utils.MybaitsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author lucas
 * @create 2020/11/22
 */
public class MyTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybaitsUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();

    }
}
