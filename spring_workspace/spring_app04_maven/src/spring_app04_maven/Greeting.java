package spring_app04_maven;

public class Greeting implements Message{

	@Override
	public void sayHello(String string) {
		System.out.println(string);
		
	}

}
