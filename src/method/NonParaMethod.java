package method;

public class NonParaMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonParaMethod met = new NonParaMethod();
		met.True();
		
		
		NonParaMethod.Cal();
		
	}

	void True(){
		int i = 1;
		if(i<3){
		System.out.println("It is true");
		}else {
			System.out.println("It is False");
		}
	}
	
	static int Cal() {
		int j = 5;int k = 10;
		return  j+k;
	}
}
