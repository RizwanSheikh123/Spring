import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sheikh.bean.Customer;
import com.sheikh.bean.Vendor;

public class Main {
	public static void main(String[] args) {
		// Constructor Injection With Collection(List)
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sheikh/config/ap.xml");
		Vendor vendor = context.getBean("vendor",Vendor.class);
		System.out.println(vendor);
		vendor.show();
	}
}
