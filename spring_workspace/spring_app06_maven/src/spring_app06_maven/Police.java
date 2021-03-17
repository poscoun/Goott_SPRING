package spring_app06_maven;

public class Police implements Character {
	
	Weapon w;
	Gun g;
	StunGun s;
	
	int hp;
	
	public Police() {
		this.hp = 100;
	}
	
//	public Police(Weapon w, int hp	 ) {
//		this.w = w;
//		this.hp = hp;
//	}
	
	// setter, getter
	
	public Weapon getW() {
		return w;
	}
	
	public void setW(Weapon w) {
		this.w = w;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("뚜벅뚜벅 순찰을 돌아요");
	}


	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		System.out.println(it + " 을 맛있게 먹어요");
	}

	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + " 공격");
		w.use();
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj + " 얻음");
	}

}
