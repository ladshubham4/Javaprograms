package day3;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		sc.close();
		
		while(i>=0) {
			System.out.println(i);
			i--;
		}
		
		
		

	}

}
