import com.cqf.dao.UserMapper;
import com.cqf.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/9/119:34
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Mytest {
    @Test
    public  void  getuser() throws IOException {
//        String s="MybatisConfig.xml";
//        InputStream resourceAsStream = Resources.getResourceAsStream(s);
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        SqlSession sqlSession = build.openSession(true);
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.get();
//        for (int i = 0; i <users.size() ; i++) {
//            System.out.println(users.get(i));
//        }
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper usermapper = context.getBean("usermapper", UserMapper.class);
        for (User u: usermapper.get()
             ) {
            System.out.println(u);
        }
    }
}
