package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "We learn java basics as part of java sessions in java week1";
		String words[];
		String result=" ";
		words = input.split(" ");
		System.out.print(words);
		
		for(int i=0; i<words.length; i++) {
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					words[j] = "remove";
				}
			}
		}
		for(String word: words) {
			if(word != "remove") {
				result = result + word + " ";
			}
		}
		System.out.println("After duplicate deletion the string is :"+result);

		char[] charArray = input.toCharArray();
		int count = 0;
		//System.out.println(input.length());
		Set<Character> values = new LinkedHashSet<Character>();
		
		
		for(char ch: charArray) {
			if(ch!=' ') {
				values.add(ch);	
			}
			System.out.println(values);	
		}
		for(Character eachChar:values) {
			System.out.print(eachChar);
		}
	}

}
