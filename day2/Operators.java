package day2;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		double c=.75;
		
		System.out.println("-----Arithmetic Operators----");
		
		System.out.println("Result: " +(a+b));
		System.out.print(+c);
		System.out.print("\n"+c);
		
		System.out.println("-----Realational Operators----");
		
		System.out.println(a==b);
		System.out.println(a>c);
		System.out.println(a!=b);
	
		if (a>b){
			System.out.println("a is greater");
		}
		else {
			System.out.println("b is greater");
		}
		
		//boolean operators
		
		boolean x=false;
		boolean y=true;
		
		System.out.println("-----Logical Operators----");
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		
		// increment/decrement operators ++ --
		System.out.println("-----Incremental operators----");
		
		a=10;b=11;
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);
		
		//assignment 
	}

}
