package src;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 553, temp1 = 0, cube = 0;
		
		for(int i = 1; m!=0; i++) 
		{
			int r = m % 10;
			
			cube = r*r*r;
			
			temp1 = cube;
			
			m=m/10;
			
			System.out.println("Armstrong no :" +temp1);
			
		}
		
	}

}
