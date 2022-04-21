package test.com;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class StringDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

				String str="shashank";
				System.out.println(isDuplicate(str));
				

			}
			
			public static boolean isDuplicate(String str) {
				HashMap<Character,Integer> map = new HashMap<Character,Integer>();
				char ch[] = str.toCharArray();
				for(Character c : ch) {
					if(map.containsKey(c)) {
						map.put(c, map.get(c)+1);
					}
					else {
						map.put(c, 1);
					}
				}
				//Iterating
				Set<Entry<Character,Integer>> entry = map.entrySet();
				for(Entry<Character,Integer> en : entry) {
					if(en.getValue()>1) {
						return false;
					}
					else {
						return true;
					}
				}
				return true;
			}

			

	}


