package src;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int m =sc.nextInt();
		
		//int m = 1234;
		int temp = 0;
		for(int i=0;m!=0;i++) 
		{
			int l = m % 10;
			 temp = l;
			m = m/10;
			
			System.out.print(temp);
			
		}
		
	}

}