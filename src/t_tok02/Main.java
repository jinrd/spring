package t_tok02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		// 베터리 일체형
		WhitePhone wp = new WhitePhone();
		wp.show();
		
		// 베터리 분리형 - DI 디자인 패턴
		BlackPhone bp = new BlackPhone();
		bp.show();
		
		// 새로산 베터리
		// 생성자 주입 방법
		Battery newBattery = new Battery("생성자 배터리");
		bp.setBattery(newBattery);
		bp.show();
		
		// 세터 주입 방법
		newBattery.setName("세터 배터리");
		bp.setBattery(newBattery);
		bp.show();
		
		// 스프링을 이용하는 방법
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Phone ph = (Phone)context.getBean("blackphone");
		ph.show();
	}
}
