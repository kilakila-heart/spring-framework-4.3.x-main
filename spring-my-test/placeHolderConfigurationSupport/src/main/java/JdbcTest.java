import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class JdbcTest {
    public static void main(String[] args) {
        //这里的applicationContext.xml要写全
        ApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        DruidDataSource dataSource = (DruidDataSource) app.getBean("dataSource");
        //调用连接池返回一个连接对象
        DruidPooledConnection connection;
        {
            try {
                connection = dataSource.getConnection();
                System.out.println(connection.toString());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
