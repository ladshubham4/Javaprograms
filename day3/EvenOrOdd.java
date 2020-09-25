package day3;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		sc.close();
		if (a%2==0) {
			System.out.println("even number");
			
		}
		else {
			System.out.println("odd number");
		}

	}

}
