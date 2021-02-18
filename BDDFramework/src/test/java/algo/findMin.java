package algo;

public class findMin {

	public static void main(String[] args) {
		
		int num[]= {23,45,12,67,98};
		
		int min=num[0];
		
		for(int i=1; i<num.length; i++) {
			
			if(num[i]<min)
				min=num[i];
		}
		System.out.println(min);
		
		
		

	}

}
