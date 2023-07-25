package src;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mua u1 = new Mua();
		u1.U1(10);
		//System.out.println(u1);
		u1.toString();
		
	}

}
class Urban extends Bank {
	
	@Override
	public String toString() {
	
		System.out.println("This is overwrite method");
		return super.toString();
	
	}

	public void U1(){
		
		System.out.println("This is Urban Bank");
	}
}
class Mca extends Urban{
	
	public void U1() {
		
		System.out.println("This is MCA");
	
	}
}

class Mua extends Urban{

	
	public void U1(int i) {
		
		System.out.println("This is MUA");
		
	}
	
}

class Rural extends Bank{
	
	public void R1() {
		
		System.out.println("this is Rural bank");
	}
}
class Rca extends Rural{
	
	public void Rca() {
		
		System.out.println("This is RCA");
	}
}

class Rua extends Rural{
	
	public void Rua() {
		
		System.out.println("This is RUA");
	}
}