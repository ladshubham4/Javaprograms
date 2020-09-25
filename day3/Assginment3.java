package day3;

import java.util.Scanner;

public class Assginment3 {

	public static void main(String[] args) {
		// multiplication table 
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("Enter the number"); 
		int a=sc.nextInt();
		
		for(int i=0;i<=10;i++) {
			System.out.println(a+" x "+i+" = "+(5*i));
		}
	}

}
