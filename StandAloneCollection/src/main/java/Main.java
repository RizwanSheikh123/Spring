import java.util.Map;

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
			System.out.println(vendor.getCustomer());
			System.out.println(vendor.getCustomer().getClass().getName());
			System.out.println("--------------------------");
			System.out.println(vendor.getCharges());
			System.out.println(vendor.getCharges().getClass().getName());
			System.out.println("--------------------------");
			System.out.println(vendor.getProperties());
			System.out.println(vendor.getProperties().getClass().getName());
		}
	}