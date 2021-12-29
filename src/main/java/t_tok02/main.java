package t_tok02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		
		// 배터리 일체형
		WhitePhone wp = new WhitePhone();
		wp.show();
		
		// 배터리 분리형
		BlackPhone bp = new BlackPhone();
		bp.show();
		
		// 새로 산 배터리 객체
		// - 생성자 주입 방법
		Battery newbp = new Battery("새로 산 배터리- 생성자");
		bp.setBattery(newbp);
		bp.show();
		
		// - Setter 주입법
		newbp.setName("새로산 배터리 - 세터");
		bp.setBattery(newbp);
		bp.show();
		
		// 스프링을 이용한 방법
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BlackPhone newBp = (BlackPhone)context.getBean("blackphone");
		newBp.show();
		
		
	}
}
