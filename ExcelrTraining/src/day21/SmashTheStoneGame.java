package day21;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class SmashTheStoneGame {

	public static void main(String[] args) {
	int arr[]= {2,7,4,1,8,1};
	int ans=PlayGame(arr);
	System.out.println(ans);
	

	}
	private static int PlayGame(int arr[]) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		//add elements of array to pq
		
        for(int stone:arr){
pq.offer(stone);
        }
		while(pq.size()>1) {
			int stone1=pq.remove();
			int stone2=pq.remove();
			int diff=stone1-stone2;
			if(diff>0) {
				pq.add(diff);
			}
		}
		return pq.isEmpty() ?0:pq.peek();
		
		
	}

}
