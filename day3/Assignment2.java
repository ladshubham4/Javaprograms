package day3;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		
		if (a>b && a>c) {
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c){
			System.out.println(b+" is greater");
		}
		
		else if(c>a && c>b ) {
			System.out.println(c+" greater");
		}
			
	}

}
