package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String lol: list) {
			System.out.println(lol);
		}
		//5. Print only the even numbered elements in the list.
		for(int n = 1; n<list.size(); n+=2) {
			System.out.println(list.get(n));
		}
		//6. Print all the Strings in reverse order.
		for(int m = 4; m>=0; m--) {
			System.out.println(list.get(m));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int o = 2; o<list.size();o+=2) {
			System.out.println(list.get(o));
		}
	}
	
}
