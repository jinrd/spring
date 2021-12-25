package t_tok02;

public class WhitePhone implements Phone{
	
	private Battery battery;
	
	public WhitePhone() {
		// 일체형 배터리 내장
		this.battery = new Battery();
	}
	
	@Override
	public void show() {
		System.out.println(this.getClass().getSimpleName() + " : "+battery.getName());
	}
}
