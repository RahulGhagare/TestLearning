package method;

public class Para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Para multiply = new Para();
		int temp = multiply.mul(10, 5);
		System.out.println(+temp);
		
		int temp1 = Para.div(50, 5);
		System.out.println(+temp1);
	}

	public int mul (int i, int j) {
		
		int k = i*j;
		return k;
	}
	
	static int div(int i, int j) {
		
		int m = i/j;
		return m;
	}
	
}
