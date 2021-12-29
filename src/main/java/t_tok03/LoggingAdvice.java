package t_tok03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

// Advice: 부가 기능을 담당하는 역할. 로깅을 담당할 클래스
public class LoggingAdvice {
	
	public void beforeAdvice() {
		System.out.println("#####메소드 실행전에 로그를 출력#####");
	}
	
	public void beforeBuyConfirm() {
		System.out.println("@@@@구매전 아이템 확인은 필수 입니다.@@@@");
	}
	
	public void afterAdvice() {
		System.out.println("$$$$$$$$$$구매해주셔서 감사합니다.$$$$$$$$$$$$$");
	}
	
	public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		
		// 추가 로직
		Signature method = joinPoint.getSignature();
		System.out.println("&&&&&내가 실행한 메소드:::" + method.getName());
		// 메소드 실행
		joinPoint.proceed();
		
		// 추가 로직
		if("buyGoods".equals(method.getName())) {
			System.out.println("Goods를 구매해주셔서 감사합니다.");
		}
		else {
			System.out.println("Item을 구매해주셔서 감사합니다.");
		}
	}

}
