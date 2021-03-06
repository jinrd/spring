package t_tok03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		ItemTarget it = (ItemTarget)context.getBean("itemtarget");
		it.selectItem();
		
		it.buyItem();
		
		it.buyItems();
		
		GoodTarget gt = (GoodTarget)context.getBean("goodTarget");
		gt.buyGoods();
	}
}
