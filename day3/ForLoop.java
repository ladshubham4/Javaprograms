package day3;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		sc.close();
		
		for (int i=1;i<=a;i++) {
			System.out.println(""+i);
		}
	}

}
