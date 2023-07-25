package src;

import java.util.Scanner;

public class PositiveNegativeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int i = -2;
			Scanner sc = new Scanner(System.in);
			while(true) {
			System.out.println("Enter the No : ");
			int i = sc.nextInt();
				
				if(i<0) {
					
					System.out.println("The no " + i + " is Negative");
				}
				else {
					
					System.out.println("The no "  +  i  +  " is positive");
				}
			}
	}

}
