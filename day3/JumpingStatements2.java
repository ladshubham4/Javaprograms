package day3;

public class JumpingStatements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
				continue;
			}
			
			System.out.println(i);
			
			
		}

	}

}
