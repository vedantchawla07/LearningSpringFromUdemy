package App2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
	
};

record Address(String firstLine, String city) {
	
};

@Configuration
//This annotation suggests to the JVM that we are going to use the Spring beans and that 
//Spring has to manage the lifecycle of the objects created out of function of these classes.
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Vedant";
	}
	@Bean
	public int age() {
		return 15;
	}
	@Bean
	public Person person() {
		return new Person("VC", 12, new Address("Hoodi", "Bengaluru"));
	}
	
	@Bean
	public Address address() {
		return new Address("Howrah", "Kolkata");
	}
	
	//renaming the bean to address2. The name of the bean and function name can be different
	
	@Bean(name = "address2")
	public Address addressName() {
		return new Address("Munne", "Bengaluru");
	}
	
	//Utilizing 2 earlier created beans to create another Bean
	@Bean
	public Person person2MethodCall() {
		//calling the methods of the beans which are name age and address
		
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address) {
		//calling the beans and passing it to the person record as parameters 
		return new Person(name, age, address);
	}
}
