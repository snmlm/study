import com.snmlm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: snmlm
 * @create: 2021-05-11
 */
public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationcontext.xml");
        UserService userService = (UserService)context.getBean("userService");
        userService.add();
    }
}
