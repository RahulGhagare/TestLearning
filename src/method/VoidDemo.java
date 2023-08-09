package method;

public class VoidDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VoidDemo dm = new VoidDemo();
		dm.Number();
		
		VoidDemo.MedicalBill();
		
	}

	static void MedicalBill() {
		
		int chemist = 1500;
		int hospital = 5000;
		
		int bill = chemist + hospital;
	}
	
	public void Number() {
		int i = 10 ; int j=15;
		int k=i+j;  
	System.out.println(+k);	
	
	}
}
