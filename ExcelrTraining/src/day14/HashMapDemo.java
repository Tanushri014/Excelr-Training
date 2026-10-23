package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class HashMapDemo {

	public static void main(String[] args) {
		List<String> words=new ArrayList(Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten"));
Map<Integer,List<String>> hashmap=new HashMap();

for(String word:words) {
	int key=word.length();
hashmap.putIfAbsent(key, new ArrayList());

hashmap.get(key).add(word);

}
System.out.println(hashmap.values());
	}

}
