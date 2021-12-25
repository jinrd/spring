package t_tok01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main2(String[] args) {
		HelloWorld h = new HelloWorld();
		h.setHello("asdf");
		System.out.println(h.getHello());
	}
	
	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			HelloWorld h = (HelloWorld) context.getBean("helloworld");
			System.out.println(h.getHello());
	}
}
