package algo;

public class findMax {

	public static void main(String[] args) {
		
		int num[]= {7,8,4,5,6,9};
		
		int max=num[0];
		
		for(int i=0; i<num.length; i++) {
			
			if(num[i]>max)
				max=num[i];
		}
		System.out.println(max);

	}

}
