package day3;

import java.util.Scanner;

public class WeekPrintFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index number of day of week between 0 and 6 :");
		int a=sc.nextInt();
		sc.close();
		String b[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		for (int i=0;i<=b.length;i++) {
			System.out.println(""+b[a]);
		}

	}

}
