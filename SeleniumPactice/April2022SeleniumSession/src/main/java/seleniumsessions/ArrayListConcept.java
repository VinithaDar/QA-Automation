package seleniumsessions;


import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		List<String>  ar = new ArrayList<String>();
		 ar.add("Red");
		 ar.add("Black");
		 ar.add("White");
		 
		 for(String e:ar) {
			 System.out.println(e);
		 }
		 
		 System.out.println(ar);

	}

}
