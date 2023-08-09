package method;

public class IntReturnDemo {

	public int add (int a, int b){
		
		int c = a+b;
		return c;
	}
	
	static int sub(int a , int b) {
		
		int c = a-b;
		return c;
	
	}
	
	public static void main(String[] args) {
		
	IntReturnDemo res = new IntReturnDemo();
	int sum = res.add(50, 51);
	System.out.println(+sum);	
	
	int sum1= IntReturnDemo.sub(50, 20);
	System.out.println(+sum1);
	
	}
	
}
 