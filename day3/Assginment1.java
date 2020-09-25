package day3;

import java.util.Scanner;

public class Assginment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		sc.close();
		
		if(a>0) {
			System.out.println("number is +ve");
		}
		else {
			System.out.println("number is -ve");
		}
	}

}
