package day3;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		sc.close();
		
		for (int i=a;i>=0;i--) {
			System.out.println(i);
		}
	}

}
