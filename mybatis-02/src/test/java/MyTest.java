import com.lucas.dao.StudentMapper;
import com.lucas.dao.TeacherMapper;
import com.lucas.dto.Student;
import com.lucas.dto.Teacher;
import com.lucas.utils.MybaitsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author lucas
 * @create 2020/11/22
 */
public class MyTest {

    @Test
    public void Test() {
        SqlSession sqlSession = MybaitsUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        mapper.getTeacher(1);

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudent();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
