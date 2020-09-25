package day3;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// Count number of digits in a number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int a=sc.nextInt();
//		int b=Integer.toString(a).length();
//		
//		
//		System.out.println(b);
//		sc.close();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		int count=0;
		sc.close();
		
		
		while(a!=0) {
			a=a/10;
			++count;
		}
		System.out.println("total digits in number: "+count);
	}

}
