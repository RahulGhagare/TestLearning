package src;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 34;
		int k = 12;
		
		int temp = 0;
		
		if(i>j) {
			
			temp=i;
		}
		else {
			
			temp = j;
		}
		if(temp > k) {
			
			System.out.println("Greatest No is " +temp);
		}
		else {
			
			System.out.println("Greatest No is" +k);
		}
		
	}

}
