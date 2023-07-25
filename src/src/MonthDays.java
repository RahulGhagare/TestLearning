package src;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int no_of_days = 0;
		String NameofMonth = "unknown";
		
		
		System.out.println("Enter no of month :");
		int month = sc.nextInt();
		
		
		System.out.println("Enter no of year :");
		int year = sc.nextInt();
		
		switch (month){
			
		case 1 : 
			NameofMonth = "January";
			no_of_days = 31;
			break;
			
		case 2 :
			NameofMonth = "February";
			if((year%400 ==0 ) || ((year%4==0) && (year%100!=0))) {
			no_of_days = 29;
			}
			else {
				
				no_of_days=28;
			}
			break;
			
		case 3 :
			NameofMonth = "March";
			no_of_days = 31;
			break;
		case 4 :
			NameofMonth = "April";
			no_of_days = 30;
			break;
		case 5 :
			NameofMonth = "May";
			no_of_days = 31;
			break;
		case 6 :
			NameofMonth = "June";
			no_of_days = 30;
			break;
		case 7 :
			NameofMonth = "July";
			no_of_days = 31;
			break;
		case 8 :
			NameofMonth = "August";
			no_of_days = 31;
			break;
		case 9 :
			NameofMonth = "September";
			no_of_days = 30;
			break;
		case 10 :
			NameofMonth = "October";
			no_of_days = 31;
			break;
		case 11 :
			NameofMonth = "November";
			no_of_days = 30;
			break;
		case 12 :
			NameofMonth = "December";
			no_of_days = 31;
			break;
			
		
			}
		
		System.out.println(NameofMonth + " " + "has "  + no_of_days + " days");
		
	}

}
