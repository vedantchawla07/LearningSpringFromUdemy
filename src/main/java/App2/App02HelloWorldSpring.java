package App2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		System.out.println("Runnign Spring");
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
		
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("address2"));
//		System.out.println(context.getBean(Address.class));
		//does not work because there are two beans which are returning the address type.
		//spring does not know which one to call
	}
}
