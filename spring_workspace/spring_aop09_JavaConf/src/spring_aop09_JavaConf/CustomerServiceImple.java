package spring_aop09_JavaConf;

public class CustomerServiceImple implements CustomerService{
	
	String name;
	String email;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		
		// 복잡한 로직이 있는 것처럼 처리 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("이름 : "+ name);
	}

	@Override
	public void printEmail() {
		// TODO Auto-generated method stub
		System.out.println("이메일: "+ email);
	}

}
