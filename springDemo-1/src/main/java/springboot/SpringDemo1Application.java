package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.controller.GreetingController;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class SpringDemo1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDemo1Application.class, args);
		
		GreetingController gc = (GreetingController) ctx.getBean("greetingController");
		
		gc.sayHello();
		
	}

}
