import com.itheima.config.SpringConfig;
import com.itheima.config.SpringMvcSupport;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx1= new AnnotationConfigApplicationContext(SpringConfig.class);


        String[] names = ctx1.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }
}
