package javaTest;

import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int[] a= {1, 2, 3};
		int[] b= {1, 2, 3};
		
		//Using Arrays.equals method for Array comparision
		
		if (Arrays.equals(a, b)){
			System.out.println("a, b are equal arrays");
		}
			
		//Printing out an array using toString method
		System.out.println(Arrays.toString(a)); 
		
		//Copying contents of one array to another.
		
		int[] c= {1,2,3,4,5,6};
		int[] d = new int[c.length];
		
		for (int i=0; i< c.length; i++ ){
			d[i]=c[i];
		}
		//printing out the contents of array d.
		
		System.out.println(Arrays.toString(d));
	}

}




