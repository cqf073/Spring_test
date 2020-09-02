import com.cqf.dao.Student;
import com.cqf.dao.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/8/2520:12
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class Mytest {


    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student students = (Student) context.getBean("students");
        String name = students.getName();
        System.out.println(name);
        System.out.println(students.toString());
    }
    @Test
    public void  test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user==user1);
    }

}
