package seleniumsessions;

public class ArrayDuplicates {

	public static void main(String[] args) {
		
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java", "Python" };

		
		System.out.println("Duplicates elements is given array:");
		for(int i=0; i<names.length; i++) {
			for(int j = i+1; j<names.length; j++) {
				if(names[i]==names[j]) {
					System.out.println(names[j]);
				}
			
				
			}
		}
		
		
		
		
	}

}
