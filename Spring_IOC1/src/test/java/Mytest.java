import com.cqf.dao.UserdaoImpl;
import com.cqf.service.service;
import com.cqf.service.serviceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/2510:12
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        serviceImpl ser = (serviceImpl) context.getBean("ser");
        ser.getService();
    }
}
