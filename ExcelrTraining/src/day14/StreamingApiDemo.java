package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamingApiDemo {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5);
		//display the squares of all odd numbers
		//imperative style
		List <Integer> oddNumbers=new ArrayList();
		for(int n:numbers) {
			if(n%2==1) {
				oddNumbers.add(n);
			}
		}
		List <Integer> oddNumbersSqr=new ArrayList();
		for(int n: oddNumbers) {
			int squared=n*n;
			oddNumbersSqr.add(squared);
			
		}
		for(int n:oddNumbersSqr) {
			System.out.println(n);
		}
//functional  programming 
		numbers.stream().filter(n->n%2==1).map(n->n*n).forEach(n->System.out.println(n));
		
		
		//sum of squares of all numbers
				int ans=numbers.stream().map(n->n*n).reduce(0,(acc,n)->acc+n);
				System.out.println(ans);
				
	}

}
