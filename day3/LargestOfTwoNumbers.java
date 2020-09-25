package day3;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1: ");
		int a=sc.nextInt();
		System.out.println("enter num2");
		int b=sc.nextInt();
		sc.close();
		
		if (a>b) {
			System.out.println("num1: "+a+ " is greater");
		}
		else if(a<b) {
			System.out.println("num2: "+b+" is greater");
		}
		else {
			System.out.println("Both num1: "+a+" and num2: "+b+" are equal");
		}

	}

}
