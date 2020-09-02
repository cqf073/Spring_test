import com.cqf.dao.UserMapper;
import com.cqf.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/9/215:58
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper usermapper = context.getBean("usermapper", UserMapper.class);
        for (User user:usermapper.get()
             ) {
            System.out.println(user);
        }

}
}
