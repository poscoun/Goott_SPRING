package spring_app10_anno;

public class PhoneOS {
	String name;
	String version;


	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public void printOs() {
		System.out.println("OS Name : "+ this.name);
	}
	
	public void printVersion() {
		System.out.println("Version : "+ this.version);
	}
	
}

