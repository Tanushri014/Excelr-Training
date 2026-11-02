package day21;

public class BankRobbery {

	public static void main(String[] args) {
		//a array containing the start and stop time are given 
		//the time required to rob given
		//total bank hours are also given 
		//our job is to tell whether the roberry is possible or not .
		int shifts[]= {0,2,2,6,6,8,9,15};
		
		//start at 0 ends at 2 .....starts at 2 ends at 6 likewise
		
		int timeToRob=3;
		int totalBankHours=15;
		System.out.println(mission(shifts,timeToRob,totalBankHours)?"Mission Possible":"Mission IMPossible");

	}
	private static boolean mission(int []shifts,int timeToRob,int totalBankHours) {
		int gaurdedHours=0;
		for(int i=0;i<shifts.length;i+=2)
		{
			gaurdedHours=gaurdedHours+(shifts[i+1]-shifts[i]);
		}
		
				
		int ungaurdedHours=totalBankHours-gaurdedHours;
		System.out.println(ungaurdedHours);
		return timeToRob<=ungaurdedHours;
	}

}
