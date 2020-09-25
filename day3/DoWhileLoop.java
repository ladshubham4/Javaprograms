package day3;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// In very rare case we use do while loop
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number:");
			int a=sc.nextInt();
			sc.close();
			
			do {
				System.out.println(a);
				a++;
				
				
			}while(a<=10);
	}

}
