package day4;

import java.util.Scanner;

public class MultiDimArrayOr2D_Array_1 {

	public static void main(String[] args) {
		 
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		
		for(int i=0;i<3;i++) {
		
				for(int j=0;j<2;j++) {
					System.out.println(a[i][j]);
				}
			}
		//to print number of rows
		System.out.println("Number of rows:"+a.length);
		
		//to print number of columns
		System.out.println("number of columns:"+a[0].length);
		
					
		}
		

	}


