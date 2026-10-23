package day14;

public class AccumulatorPattern {

	public static void main(String[] args) {
		int arr[]= {1,9,25};
int acc=0;
for(int n:arr) {
	acc+=n;
}
System.out.println(acc);
	}

}
