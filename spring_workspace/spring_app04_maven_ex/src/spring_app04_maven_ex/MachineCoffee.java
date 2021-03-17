package spring_app04_maven_ex;

public class MachineCoffee implements Beverage {

	String product;
	
	public MachineCoffee() {
		this.product = "테스트캡슐";
		// TODO Auto-generated constructor stub
	}
	
	public MachineCoffee(String product) {
		this.product = product;
	}
	
	@Override
	public void drink(String name) {
		System.out.println(name + " 님이 " + product + "을/를 홀짝홀짝 마십니다.");
		
	}

}
