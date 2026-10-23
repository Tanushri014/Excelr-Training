package day14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo2 {

	public static void main(String[] args) {
		List <String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","Octomber","November","December");
	Map<Boolean,List<String>> hashmap=	months.stream().collect(Collectors.partitioningBy(m->m.endsWith("ber")));
System.out.println(hashmap);


Map<Boolean,String> hashmap2=months.stream().collect(Collectors.partitioningBy(m->m.endsWith("ber"),Collectors.joining()));
System.out.println(hashmap2);

//with seperator 
Map<Boolean,String> hashmap3=months.stream().collect(Collectors.partitioningBy(m->m.endsWith("ber"),Collectors.joining("-")));
System.out.println(hashmap3);


	}

}
