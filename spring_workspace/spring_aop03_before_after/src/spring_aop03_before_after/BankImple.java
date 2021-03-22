package spring_aop03_before_after;

public class BankImple implements Bank {
	
	String name;
	int balance;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}



	@Override
	public void transfer(int money) {
		// TODO Auto-generated method stub
		System.out.println("계좌이체를 시작합니다");
		System.out.println(name + " 님 계좌에서" + money + " 원 출금되었습니다");
		
		if(balance > money) {
			balance -= money;	
		}
		
		System.out.println("잔액: "+ balance + " 원 입니다");
	}

}
