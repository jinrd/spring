package t_tok02;

public class BlackPhone implements Phone{
	Battery battery;
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public BlackPhone() {
		this.battery = new Battery();
	}
	
	public BlackPhone(Battery battery) {
		super();
		this.battery = battery;
	}
	
	@Override
	public void show() {
		System.out.println(this.getClass().getSimpleName()+" : "+battery.getName());
	}
}
