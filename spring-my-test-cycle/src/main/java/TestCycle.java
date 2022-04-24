import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {
    public static void main(String[] args) {
        String CONTEXT_XML = "classpath:/cycle.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONTEXT_XML);
        A bean = applicationContext.getBean(A.class);
        System.out.println(bean.getB());
        B bean1 = applicationContext.getBean(B.class);
        System.out.println(bean1.getA());
    }
}
