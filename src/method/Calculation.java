package method;

public class Calculation {

	
	int add() {
		
		int i = 10;
		int j = 11;
		int res = i+j;
		return res;
	}
	
	static void sub() {
		
		int i = 15;
		int j = 10;
		int res = i-j;
		System.out.println("Substraction :" +res);
	}
	
	public static void main(String[] args) {
		
		Calculation cd = new Calculation();
		int value = cd.add();
		System.out.println("Addition:" +value);
	
		Calculation.sub();
		
	}
	
}
