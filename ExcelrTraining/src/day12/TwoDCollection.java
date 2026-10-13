package day12;

import java.util.ArrayList;
import java.util.List;
public class TwoDCollection {

	public static void main(String[] args) {
		List <String> mh =new ArrayList<>();
		mh.add("Pune");
		mh.add("Mumbai");
		mh.add("Nagpur");
		
		List <String> rj =new ArrayList<>();
		rj.add("Jaipur");
		rj.add("Bikaner");
		rj.add("Kota");
		
		
		List <List<String>> India =new ArrayList<>();
		India.add(mh);
		India.add(rj);
		System.out.println(India.get(1).get(0));
		
		System.out.println(India.get(0).get(2));

	}

}
