package day3;

import java.util.Scanner;

public class JumpingStatements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		sc.close();
		
		
		for(int i=1;i<=a;i++) {
			if(i==3 || i==5||i==7) {
				continue;
			}
			System.out.println(i);
		}
	}

}
