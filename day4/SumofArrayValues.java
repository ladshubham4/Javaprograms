package day4;

import java.util.Scanner;

public class SumofArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int length=sc.nextInt();
		int array[]=new int[length];
		int temp=0;
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<length;i++) {
			array[i]=sc.nextInt();
			
			
		}
		for(int i=0;i<length;i++) {
			temp+=array[i];
			
		}
		System.out.println("Sum of elements of array: "+temp);
	


	}
	

}
