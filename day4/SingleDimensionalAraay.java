package day4;

public class SingleDimensionalAraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int a[5]= {1,2,3,4,5};  declared array with size 5
//			
//		int a[]=new int[5]; //declare array by specifiying size
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=4;
		
//		for(int i=0;i<4;i++) {
//			System.out.println(a[i]);
//		}
				
		int a[]= {1,23,4,5}; //assign array size dynamically

		System.out.println("length of array: "+a.length); //prints szie of array
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
	
	
	}
}