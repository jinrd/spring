package t_tok1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main2(String[] args) {
		HelloWorld hello = new HelloWorld();
		/*
		helloworld 를 hellokorea 로 수정하고 싶으면
		class 를 직접 수정해 줘야 한다.
		 */
		hello.setMessage("hello korea");
		System.out.println(hello.getMessage());
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld");
		
		System.out.println(hello.getMessage());
	}

}
