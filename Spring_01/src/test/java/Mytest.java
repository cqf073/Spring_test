import com.cqf.dao.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/2510:36
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Mytest {
    public static void main(String[] args) {

        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        hello he = (hello) context.getBean("123");
        hello he1 = (hello) context.getBean("hello");
        System.out.println(he);
        System.out.println(he1);
    }
}
