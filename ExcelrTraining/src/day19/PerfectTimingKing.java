package day19;

public class PerfectTimingKing {

	public static void main(String[] args) {
		int start[]= {1,3,0,5,8,5};
		int finish[]={2,4,6,7,9,9};
		
		int max_event=1;
		int j=0;
		for(int i=1;i<start.length-1;i++) {
			
			if(start[i]>finish[j]) {
				max_event+=1;
				j=i;
			}
		}
		System.out.println(max_event);

	}

}
