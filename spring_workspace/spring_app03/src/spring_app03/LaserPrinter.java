package spring_app03;
public class LaserPrinter implements Printer{

	@Override
	public void printing(String msg) {
		System.out.println("LaserPrinter 예열 중 .........");
		System.out.println("msg : "+ msg);
		
	}

}
