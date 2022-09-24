package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		Set<String> Fintext = new LinkedHashSet<String>();
		for (String eachWord : split) {
			if (eachWord!= " ") {
				Fintext.add(eachWord);
				

			}
		}
		
		for (String finalOutput : Fintext) {
			System.out.print(" "+finalOutput+" ");

		}

	}

}
