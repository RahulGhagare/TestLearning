package humanchat;

public class Human {

	String name;
	int age;
	static String country = "INDIA";
	
	
	
	public void speak(String content) {
		
		System.out.println(name + "[" +age + "]" + "[" +country+ "]" + " - "+content);
		
	}
	
}
