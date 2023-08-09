package humanchat;

public class Chatter {

	public static void main(String[] args) {
		
		Human.country = "India";
		
		Human h1 = new Human();
		h1.name = "Rahul";
		h1.age = 27;
//		h1.country = "INDIA";
		
		Human h2 = new Human();
		h2.name = "Akanksha";
		h2.age=24;
//		h2.country = "INDIA";
		
		Human h3 = new Human();
		h3.name = "Mahesh";
		h3.age =25;
//		h3.country = "Pakistan";
		
		
		h1.speak("Hey ! How are You ?");
		h2.speak("Yeah! I'm Great");
		h3.speak("Great!");
	}
	
}
