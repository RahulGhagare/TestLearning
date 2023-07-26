package src;

import java.util.Scanner;

public class Sum_Difference {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First No : ");
		int i = sc.nextInt();
		
		System.out.println("Enter the Second No : ");
		int j = sc.nextInt();
		
		
//		Sum
		int sum = i + j;
		System.out.println("Sum of digits " +i+ " and " +j+ " is "+sum);
		
		//Difference
		int diff = 0;
		if(i>j) {
			
			diff = i - j;
			System.out.println("Difference of digits " +i+ " and " +j+ " is "+diff);
		}else {
			
			diff = j-i;
			System.out.println("Difference of digits " +j+ " and " +i+ " is "+diff);
		}
		
		//Product
		
		int pro = i * j;
		System.out.println("Product of digits " +i+ " and " +j+ " is "+pro);
		
		//Average 
		
		int average = (i + j)/2;
		System.out.println("Average of digits " +i+ " and " +j+ " is "+average);
		
		//Distance
		int dist = 0;
		if(i>j) {
			
			dist = i - j;
			System.out.println("Distance of digits " +i+ " and " +j+ " is "+dist);
		}else {
			
			dist = j-i;
			System.out.println("Distance of digits " +j+ " and " +i+ " is "+dist);
		}
		//max no
		
		if(i > j) {
			int max = i ;
			System.out.println("Larger no between " +i+ " and " +j+ " is "  +max);
		}else if(i==j){
			
			System.out.println("Both the numbers are equal");
		}
		else{
			int max = j ;
			System.out.println("Larger no between " +i+ " and " +j+ " is "  +max);
		}
		
		//min no 
		if(i < j) {
			int min = i;
			System.out.println("Smaller no between " +i+ " and " +j+ " is " +min);
		}else if(i==j) {
			System.out.println("Both the numbers are equal");
		}else {
			int min = j;
			System.out.println("Smaller no between " +i+ " and " +j+ " is " +min);
		}
		
		}
	
	}
	