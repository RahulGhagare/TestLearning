package src;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the No :");
		int i = sc.nextInt();
		
		if(i == 1) {

			System.out.println("Sunday");
		}
		else if(i==2) {

			System.out.println("Monday");
		}
		else if(i==3) {

			System.out.println("Tuesday");
		}
		else if(i==4) {

			System.out.println("Wednesday");
		}
		else if(i==5) {

			System.out.println("Thursday");
		}else if(i==6) {

			System.out.println("Friday");
		}else if(i==7) {

			System.out.println("Saturday");
		}
		else {
			
			System.out.println("No weekdays");
		}
	}
	}

}
