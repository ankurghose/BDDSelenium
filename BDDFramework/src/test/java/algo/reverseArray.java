package algo;

import edu.emory.mathcs.backport.java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		
		
		int x[]= {5,6,8,4,8,9};
		
		int temp;
		
		for(int i=0; i<x.length/2; i++) {
			
			temp=x[i];
			x[i]=x[x.length-1-i];
			x[x.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(x));
	}

}
