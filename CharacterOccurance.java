package Week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="amazon India";
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charArray = input.toCharArray();
//		for (char c:charArray) {
//			//check whether a is already available in Map
//			if(map.containsKey(c))
//			{
//			map.put(c, map.get(c)+1);
//		}
//			else
//			{
//				map.put(c, 1);
//				
//			}
//	}
//		for (int i=0;i<charArray.length;i++) {
//			if(map.containsKey(charArray[i])) {
//				map.put(charArray[i],map.get(charArray[i])+1);
//			}
//			else
//				map.put(charArray[i], 1);
//		}
		for (char c : charArray) {
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		System.out.println(map);
//		map.entrySet();
//		Set<Entry<Character,Integer>> entryset =map.entrySet();
			
		}
}
