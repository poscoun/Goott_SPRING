package spring_app07_anno;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingImple implements Greeting {
	
	// GreetingImple - 현재시각과 메시지를 출력하는게 목적
	// 1. 생성자 or setter 이용 초기화
	// 2. 필요한 참조주소, 메시지를 매칭

	String msg;
	
	@Autowired	// 필요한걸 찾아서 자동으로 묶어줘.
	NowTime nt;
	
//	public GreetingImple(String msg) {
//		this.msg = msg;
//	}
	
	// 생성자 or getter,setter 둘 중 아무거나 사용
	
	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public NowTime getNt() {
		return nt;
	}



	public void setNt(NowTime nt) {
		this.nt = nt;
	}



	@Override
	public void printMsg() {
		// TODO Auto-generated method stub
		System.out.println("현재 시각 : " + nt.getTime() + " - " + this.msg);
	}

}
