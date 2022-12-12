

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sheikh.bean.Emp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("ap.xml");
    	Emp emp1  =  context.getBean("emp",Emp.class);
    	System.out.println(emp1);
    }
}
