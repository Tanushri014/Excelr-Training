package day21;
import java.util.Collections;
//Java's default PriorityQueue follows a Min-Heap structure, meaning the smallest element has the highest priority.
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
PriorityQueue<Integer> pq=new PriorityQueue<>();

pq.add(20);
pq.add(30);
pq.add(50);
pq.add(10);
System.out.println(pq.poll());

//smallest element will have highest priority




//Highest element will have highest priority
PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());

pq2.add(20);
pq2.add(30);
pq2.add(50);
pq2.add(10);


System.out.println(pq2.poll());

	}

}
