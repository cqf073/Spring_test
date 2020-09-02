import com.cqf.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/3119:08
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Mytest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//      代理的一定是接口
        UserService userservice = (UserService)context.getBean("userservice");
        userservice.delete();
    }
}
