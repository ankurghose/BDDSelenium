package algo;

public class searchALetter {

	public static void main(String[] args) {
		
		String name="apple";
		
		char find='p';
		
		int occurence=0;
		
		for(int i=0; i<name.length(); i++) {
			
			if(find==name.charAt(i))
				occurence++;
		}
		System.out.println(occurence);

	}

}
