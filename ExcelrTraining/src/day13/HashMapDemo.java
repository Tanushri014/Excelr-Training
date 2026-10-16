package day13;
import java.util.Map;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Double> hashmap=new HashMap();
		hashmap.put("Alice", 800.0);
		hashmap.put("Ben",   900.0);
		hashmap.put("Chris", 1000.0);
		System.out.println(hashmap);
		
		hashmap.put("Ben",   1500.0);
		System.out.println(hashmap);

	}

}
