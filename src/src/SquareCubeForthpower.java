package src;

import java.util.Scanner;

public class SquareCubeForthpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No : ");
		//int i = 2;
		int i = sc.nextInt();

		int square = 0;
		int cube = 0;
		int fpower = 0;

		square = i*i;

		System.out.println("The square of no " + i + " is " +square);
		cube = i*i*i;
		System.out.println("The cube of no " + i + " is " +cube);

		fpower = i*i*i*i;
		System.out.println("The Fourth power of no " + i + " is " +fpower);
	}

}
