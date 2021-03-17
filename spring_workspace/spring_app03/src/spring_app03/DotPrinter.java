package spring_app03;

public class DotPrinter implements Printer{

	@Override
	public void printing(String msg) {
		System.out.println("DotPrinter 예열 중 .........");
		System.out.println("msg : "+ msg);
		
	}

}
