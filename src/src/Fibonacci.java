package src;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=0, n=1, l;
		
		System.out.println(" "+m + " "+n);
		
		for(int i=2;i<20;i++) 
		{
			
			l = m+n;
			System.out.println("Fibonaaci series:" +l);
			
			m = n;
			n=l;
			
			
		}
		
		
	}

}
