package t_tok02;

public class Battery {
	private String name;
	
	//  생성자
	public Battery() {
		this.setName("배터리");
	}
	
	// 인자 값을 받는 생성자
	public Battery(String name) {
		super();
		this.name = name;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	
	

}
