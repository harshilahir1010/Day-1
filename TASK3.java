import java.util.*;
public class TASK3 {
	public static void main(String args[]) {
		int n,d,s=0;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number");
		n=a.nextInt();
		if(n<0 || n>32767) {
			System.out.println("Invalid Input");
		}
		else {
		while(n!=0) {
			d=n%10;
			if(d%2!=0) {
				s=s+d;
			}
				n=n/10;
				
		}				System.out.println("Sum of Odd Digit is"+s);

		}

}
}
