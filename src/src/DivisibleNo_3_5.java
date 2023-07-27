package src;

public class DivisibleNo_3_5 {

	public static void main(String[] args) {

		for(int i = 1;i<=100; i++) {

			//Number divisible by 3
			if(i%3==0) {

				System.out.println("The number divisible by 3 are :" +i);
			}
		}
		System.out.println("");
		
		//Number divisible by 5
		for(int j = 1;j<=100; j++) {
			if(j%5==0) {

				System.out.println("The number divisible by 5 are :" +j);
			}

		}
		System.out.println("");
		
		
		//Number divisible by 3 and 5
		for (int m = 1; m<=100; m++) {
			if(m%3 == 0 && m%5==0) {
			System.out.println("The number divisible by 3 and 5 are :"+m);
			}
		}

	}
}
