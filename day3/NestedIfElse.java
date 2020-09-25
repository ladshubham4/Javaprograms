package day3;

import java.util.Scanner;

public class NestedIfElse{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between!! 1-7");
		int a=sc.nextInt();
		sc.close();
		
		if (a==1) {
			System.out.println("its monday");
			
		}
		else if(a==2) {
			System.out.println("its tuesday");
		}
		else if(a==3) {
			System.out.println("its wednesday");
		}
		else if(a==4) {
			System.out.println("its thursday");
		}
		else if(a==5) {
			System.out.println("its friday");
		}
		else if(a==6) {
			System.out.println("its saturday");
		
		}
		else if(a==7) {
				System.out.println("its sunday");
			}
		else {
			System.out.println("Error, Enter correct number between 1-7");
		}
		
	}
}
