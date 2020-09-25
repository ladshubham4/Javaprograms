package day3;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number between 1 and 7");
		int a=sc.nextInt();
		sc.close();
		
		switch (a) {
			case 1: System.out.println("its monday");
				break;
			case 2: System.out.println("its tueday");
			break;
			case 3:System.out.println("its wednesday");
			break;
			case 4: System.out.println("its thursdasy");
			break;
			case 5:System.out.println("its friday");
			break;
			case 6:System.out.println("its saturday");
			break;
			case 7:System.out.println("its sunday");
			break;
			default:
				System.out.println("Error,enter number between 1 and 7");
		
		
		}
	}

}
