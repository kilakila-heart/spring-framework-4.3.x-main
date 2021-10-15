
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shucheng on 2019-6-29 下午 20:42
 */
public class SimpleDemoTest {

    @Test
    public void test() {
        String CONTEXT_XML = "classpath:/META-INF/spring-student.xml";

        ApplicationContext ac = new ClassPathXmlApplicationContext(CONTEXT_XML);
        Teacher teacher = (Teacher) ac.getBean("teacher");
        System.out.println(teacher);
    }
}