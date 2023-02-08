import java.util.*;
public class TASK1{
	public static void main(String args[]) {
		double s,sh,sh1=0.0,sh2=0.0,fe=0.0,te=0.0,tte=0.0,tts=0.0,ts=0.0;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter Salary of Ramya");
		s=n.nextDouble();
		System.out.println("Enter number of shifts completed");
		sh=n.nextDouble();
		if(s>8000) {
			System.out.println("Salary too High");
			}
		else if(s<0) {
			System.out.println("Salary too Low");
		}
		else if(sh<0) {
			System.out.println("Shift too Low");
		}
		else {
			sh1=0.02*s;
			sh2=sh*sh1;
			fe=0.20*s;
			te=0.30*s;
			tte=fe+te;
			tts=s+sh2;
			ts=tts-tte;
			System.out.println("Total Saving of Ramya="+ts);
		}
	}
}
