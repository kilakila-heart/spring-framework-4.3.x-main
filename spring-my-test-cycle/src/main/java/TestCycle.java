import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {
    public static void main(String[] args) {
        String CONTEXT_XML = "classpath:/cycle.xml";
        //BeanFactory是延迟加载,AplicationContext，它是在容器启动时，一次性创建了所有的Bean
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONTEXT_XML);
        A bean = applicationContext.getBean(A.class);
        System.out.println(bean.getB());
        B bean1 = applicationContext.getBean(B.class);
        System.out.println(bean1.getA());
    }
}
