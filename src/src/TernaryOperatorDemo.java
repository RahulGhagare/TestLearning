package src;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Even Odd Calculator");
		System.out.println("Enter the no");
		int Input = scan.nextInt();
		
		String EvenOdd =Input/2==0? "Even" : "Odd" ;
		System.out.println(" No is" +EvenOdd);
	
		
	}

}
